package com.jits.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jits.core.DeliveryPriorityType;
import com.jits.core.PostalCarrier;
import com.jits.core.TariffImpl;
import com.jits.core.UnitedExpress;
import com.jits.core.carrier.Tariff;

@Configuration
public class UnitedExpressConfig {

	private static final String COMPANY_NAME = "UnitedExpress";
	private static final String OTHER = "OTHER";
	private static final String SEC = "SEC";
	private static final String FRST = "FRST";
	private Map<String,Tariff> unitedExpTariffs;
	private Map<String,DeliveryPriorityType> unitedTariffCodes;
	
	UnitedExpressConfig(){
		unitedExpTariffs = new HashMap<String,Tariff>();
		unitedExpTariffs.put(DeliveryPriorityType.FIRST.toString(),(Tariff) new TariffImpl(FRST, 0.30,"48 hours"));
		unitedExpTariffs.put(DeliveryPriorityType.SECOND.toString(),(Tariff) new TariffImpl(SEC, 0.15,"1 to 3 Business Days"));
		unitedExpTariffs.put(DeliveryPriorityType.WHENEVER.toString(),(Tariff) new TariffImpl(OTHER, 0.05,"5 to 10 Business Days"));

		unitedTariffCodes = new HashMap<String,DeliveryPriorityType>();
		unitedTariffCodes.put(FRST,DeliveryPriorityType.FIRST);
		unitedTariffCodes.put(SEC,DeliveryPriorityType.SECOND);
		unitedTariffCodes.put(OTHER,DeliveryPriorityType.WHENEVER);
	}

	
	


	@Bean(name="unitedTariffCodes")
	public Map<String,DeliveryPriorityType> getUnitedTariffCodes(){		
		return unitedTariffCodes;
	}

	@Bean(name="unitedExpress")
	public PostalCarrier getUnitedExpress(){
		return new UnitedExpress(unitedExpTariffs,COMPANY_NAME);
	}
}
