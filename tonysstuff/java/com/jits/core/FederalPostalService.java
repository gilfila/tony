package com.jits.core;

import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import com.jits.core.carrier.Tariff;

public class FederalPostalService extends PostalCarrier {
	
	@Inject
	@Resource(name ="fedTariffCodes")
	private Map<String,DeliveryPriorityType> codes;

	public FederalPostalService(Map<String, Tariff> tariffsIn, String nameIn) {
		super(tariffsIn,nameIn);
	}

	@Override
	public double retrieveTariffFactor(DeliveryPriorityType dTypeIn) {
		Tariff tariff = getTariffs().get(dTypeIn.toString());
		return tariff.getFactor();
	}

	@Override
	public DeliveryPriorityType retrieveDeliveryPriorityType(String typeIn) {		
		
		return codes.get(typeIn);
	}

}
