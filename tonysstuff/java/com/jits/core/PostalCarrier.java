package com.jits.core;

import java.util.Map;

import com.jits.core.carrier.Carrier;
import com.jits.core.carrier.Tariff;

abstract public class PostalCarrier implements Carrier {
	private Map<String,Tariff> tariffs;	
	private String name;
	
	PostalCarrier(){
		
	}
	public PostalCarrier(Map<String,Tariff> tariffsIn, String nameIn){
		tariffs = tariffsIn;
		name = nameIn;
	}

	@Override
	public Map<String, Tariff> getTariffs() {
		return tariffs;
	}
	
	public void setTariffs(Map<String, Tariff> tariffsIn) {
		tariffs = tariffsIn;
	}
	@Override
	public String getName() {
		return name;
	}
	public void setName(String nameIn) {
		name = nameIn;
	}
}
