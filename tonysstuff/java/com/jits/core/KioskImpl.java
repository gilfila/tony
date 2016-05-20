package com.jits.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.corporate.core.Discount;
import com.jits.core.carrier.Carrier;
import com.jits.core.insurance.Insurable;

public class KioskImpl implements Kiosk {
	
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(KioskImpl.class);
	
	@Autowired
	private List<Discount> discounts;
	@Autowired
	private List<Carrier> carriers;	
	@Resource(name="filteredInsuranceOptions")
	private List<Insurable> deliveryInsurances;	
	private JitsDelivery delivery;	
	@Resource(name="jaxbMarshaller")
	private Jaxb2Marshaller marshaller;	
	private Confirmation confirmation;
	private Carrier selectedCarrier;
	

	@Override
	public List<Carrier> getCarriers() {
		return carriers;
	}

	@Override
	public List<Discount> getDiscounts() {
		
		return discounts;
	}

	@Override
	public Discount getDiscount(String keyIn) {
		Discount retVal = null;
		for(Discount cur: discounts){
			if(cur.getCode().equals(keyIn)){
				retVal = cur;
			}
		}
		return retVal;
	}

	@Override
	public JitsDelivery createJitsDelivery(IDeliveryPO poIn) {
		DeliveryTO deliveryTO = new DeliveryTO();
		for(Carrier cur: carriers){
			if(cur.getName().equals(poIn.getCarrier())){				
				deliveryTO.setCarrier(cur);
			}			
		}
		for(Discount cur: discounts){
			if(cur.getCode().equals(poIn.getDiscountCode())){
				deliveryTO.setDiscount(cur);
			}
		}
		
		Address origin = new Address();
		origin.setCity(poIn.getOriginCity());
		origin.setState(poIn.getOriginState());
		origin.setStreet(poIn.getOriginStreet());
		origin.setZipcode(poIn.getOriginZipcode());
		deliveryTO.setOrigin(origin);
		
		Address dest = new Address();
		dest.setCity(poIn.getDestCity());
		dest.setState(poIn.getDestState());
		dest.setStreet(poIn.getDestStreet());
		dest.setZipcode(poIn.getDestZipcode());
		deliveryTO.setDestination(dest);
		
		deliveryTO.setType(DeliveryType.valueOf(poIn.getType()));
		
		deliveryTO.setWeight(poIn.getWeight());
		
		deliveryTO.setPriority(DeliveryPriorityType.valueOf(poIn.getPriority()));
		
		delivery = JitsDeliveryFactory.createDeliverable(deliveryTO);
		return delivery;
	}

	public List<Insurable> getInsurables() {
		return deliveryInsurances;
	}

	@Override
	public void addInsuranceOption(String optionIn) {
		for(Insurable cur:deliveryInsurances){
			if(cur.getDescription() != null){
				if(cur.getDescription().equals(optionIn)){
					delivery.setInsurance(cur);
					delivery.calculateCost();
				}
				
			}
		}
		
	}

	public JitsDelivery getDelivery() {
		return delivery;
	}

	@Override
	public Confirmation confirm() throws FileNotFoundException {
		confirmation = delivery.confirm();
		File file = new File("C:\\xml\\"+ confirmation.getTrackingNumber() +".xml");
		StreamResult result = null;
		result = new StreamResult(new FileOutputStream(file));
		marshaller.marshal(confirmation, result);
		
		return confirmation;
	}

	

	@Override
	public Confirmation getConfirmation() {
		return confirmation;
	}

	@Override
	public Carrier getCarrier(String carrierNameIn) {
		Carrier retVal = null;
		for(Carrier cur: carriers){
			if(cur.getName().equals(carrierNameIn)){
				retVal = cur;
				selectedCarrier = cur;
			}
		}
		return retVal;
	}

	@Override
	public Carrier getSelectedCarrier() {
		return selectedCarrier;
	}

}
