package com.jits.core;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.corporate.core.Discount;
import com.jits.configuration.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class KioskTest {

	@Autowired
	Kiosk kiosk;

	private DeliveryTO deliveryTO;

	private JitsDelivery delivery;

	private IDeliveryPO deliveryPO;
	
	@Before
	public void setUp(){
		
		deliveryPO = new DeliveryPO();
		deliveryTO = new DeliveryTO();
	}

	
	
	

	@Test
	public void canBuildKiosk() {
		assertNotNull(kiosk);
	}

	@Test
	public void canGetDiscounts() {
		assertThat(kiosk.getDiscounts().size(), is(6));
	}

	@Test
	public void canGetCarriers() {
		assertThat(kiosk.getCarriers().size(), is(2));
	}

	@Test
	public void canGetDiscount() {
		assertThat(kiosk.getDiscount("IL005"), instanceOf(Discount.class));
	}
	
	@Test
	public void canGetInsurances(){
		assertThat(((KioskImpl)kiosk).getInsurables().size(), is(3));
	}

	@Test
	public void canCreateJitsDelivery1(){

		deliveryPO.setOriginStreet("123 Fake street");
		deliveryPO.setOriginCity("Bloomington");
		deliveryPO.setOriginState("IL");
		deliveryPO.setOriginZipcode("12345");
		deliveryPO.setDestStreet("456 Not Real Ave");
		deliveryPO.setDestCity("Peoria");
		deliveryPO.setDestState("IL");
		deliveryPO.setDestZipcode("65432");
		deliveryPO.setType("AIR");
		deliveryPO.setWeight(3.00);
		deliveryPO.setCarrier("FederalPostalService");
		deliveryPO.setPriority("FIRST");
		deliveryPO.setDiscountCode("IL005");
		
		delivery = kiosk.createJitsDelivery(deliveryPO);
	
		assertThat(delivery.getJitsPackage().getWeight(), is(3.00));
	}
	@Test
	public void canCreateJitsDelivery2(){

		deliveryPO.setOriginStreet("123 Fake street");
		deliveryPO.setOriginCity("Bloomington");
		deliveryPO.setOriginState("IL");
		deliveryPO.setOriginZipcode("12345");
		deliveryPO.setDestStreet("456 Not Real Ave");
		deliveryPO.setDestCity("Peoria");
		deliveryPO.setDestState("IL");
		deliveryPO.setDestZipcode("65432");
		deliveryPO.setType("AIR");
		deliveryPO.setWeight(3.00);
		deliveryPO.setCarrier("FederalPostalService");
		deliveryPO.setPriority("SECOND");
		deliveryPO.setDiscountCode("IL005");
		
		delivery = kiosk.createJitsDelivery(deliveryPO);
	
		assertThat(delivery.getJitsPackage().getWeight(), is(3.00));
	}
	@Test
	public void canCreateJitsDelivery3(){

		deliveryPO.setOriginStreet("123 Fake street");
		deliveryPO.setOriginCity("Bloomington");
		deliveryPO.setOriginState("IL");
		deliveryPO.setOriginZipcode("12345");
		deliveryPO.setDestStreet("456 Not Real Ave");
		deliveryPO.setDestCity("Peoria");
		deliveryPO.setDestState("IL");
		deliveryPO.setDestZipcode("65432");
		deliveryPO.setType("GROUND");
		deliveryPO.setWeight(3.00);
		deliveryPO.setCarrier("FederalPostalService");
		deliveryPO.setPriority("FIRST");
		deliveryPO.setDiscountCode("IL005");
		
		delivery = kiosk.createJitsDelivery(deliveryPO);
	
		assertThat(delivery.getJitsPackage().getWeight(), is(3.00));
	}
	@Test
	public void canCreateJitsDelivery4(){

		deliveryPO.setOriginStreet("123 Fake street");
		deliveryPO.setOriginCity("Bloomington");
		deliveryPO.setOriginState("IL");
		deliveryPO.setOriginZipcode("12345");
		deliveryPO.setDestStreet("456 Not Real Ave");
		deliveryPO.setDestCity("Peoria");
		deliveryPO.setDestState("IL");
		deliveryPO.setDestZipcode("65432");
		deliveryPO.setType("GROUND");
		deliveryPO.setWeight(3.00);
		deliveryPO.setCarrier("FederalPostalService");
		deliveryPO.setPriority("SECOND");
		deliveryPO.setDiscountCode("IL005");
		
		delivery = kiosk.createJitsDelivery(deliveryPO);
	
		assertThat(delivery.getJitsPackage().getWeight(), is(3.00));
	}@Test
	public void canCreateJitsDelivery5(){

		deliveryPO.setOriginStreet("123 Fake street");
		deliveryPO.setOriginCity("Bloomington");
		deliveryPO.setOriginState("IL");
		deliveryPO.setOriginZipcode("12345");
		deliveryPO.setDestStreet("456 Not Real Ave");
		deliveryPO.setDestCity("Peoria");
		deliveryPO.setDestState("IL");
		deliveryPO.setDestZipcode("65432");
		deliveryPO.setType("AIR");
		deliveryPO.setWeight(3.00);
		deliveryPO.setCarrier("UnitedExpress");
		deliveryPO.setPriority("FIRST");
		deliveryPO.setDiscountCode("IL005");
		
		delivery = kiosk.createJitsDelivery(deliveryPO);
	
		assertThat(delivery.getJitsPackage().getWeight(), is(3.00));
	}
	@Test
	public void canCreateJitsDelivery6(){

		deliveryPO.setOriginStreet("123 Fake street");
		deliveryPO.setOriginCity("Bloomington");
		deliveryPO.setOriginState("IL");
		deliveryPO.setOriginZipcode("12345");
		deliveryPO.setDestStreet("456 Not Real Ave");
		deliveryPO.setDestCity("Peoria");
		deliveryPO.setDestState("IL");
		deliveryPO.setDestZipcode("65432");
		deliveryPO.setType("AIR");
		deliveryPO.setWeight(3.00);
		deliveryPO.setCarrier("UnitedExpress");
		deliveryPO.setPriority("SECOND");
		deliveryPO.setDiscountCode("IL005");
		
		delivery = kiosk.createJitsDelivery(deliveryPO);
	
		assertThat(delivery.getJitsPackage().getWeight(), is(3.00));
	}
	@Test
	public void canCreateJitsDelivery7(){

		deliveryPO.setOriginStreet("123 Fake street");
		deliveryPO.setOriginCity("Bloomington");
		deliveryPO.setOriginState("IL");
		deliveryPO.setOriginZipcode("12345");
		deliveryPO.setDestStreet("456 Not Real Ave");
		deliveryPO.setDestCity("Peoria");
		deliveryPO.setDestState("IL");
		deliveryPO.setDestZipcode("65432");
		deliveryPO.setType("GROUND");
		deliveryPO.setWeight(3.00);
		deliveryPO.setCarrier("UnitedExpress");
		deliveryPO.setPriority("FIRST");
		deliveryPO.setDiscountCode("IL005");
		
		delivery = kiosk.createJitsDelivery(deliveryPO);
	
		assertThat(delivery.getJitsPackage().getWeight(), is(3.00));
	}
	@Test
	public void canCreateJitsDelivery8AndConfirm() throws FileNotFoundException{

		deliveryPO.setOriginStreet("123 Fake street");
		deliveryPO.setOriginCity("Bloomington");
		deliveryPO.setOriginState("IL");
		deliveryPO.setOriginZipcode("12345");
		deliveryPO.setDestStreet("456 Not Real Ave");
		deliveryPO.setDestCity("Peoria");
		deliveryPO.setDestState("IL");
		deliveryPO.setDestZipcode("65432");
		deliveryPO.setType("GROUND");
		deliveryPO.setWeight(3.00);
		deliveryPO.setCarrier("UnitedExpress");
		deliveryPO.setPriority("SECOND");
		deliveryPO.setDiscountCode("IL005");
		
		delivery = kiosk.createJitsDelivery(deliveryPO);
		kiosk.addInsuranceOption("Certificate Of Mailing");
		assertThat(((KioskImpl)kiosk).getDelivery().getJitsPackage().getWeight(), is(3.00));
		assertThat(((KioskImpl)kiosk).confirm(), instanceOf(Confirmation.class));
	}
}
