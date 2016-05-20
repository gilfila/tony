package com.jits.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jits.core.DeliveryPriorityType;
import com.jits.core.FederalPostalService;
import com.jits.core.PostalCarrier;
import com.jits.core.TariffImpl;
import com.jits.core.carrier.Tariff;


@Configuration
public class FederalPostalServiceConfig {

	private static final String REGULAR = "REGULAR";
	private static final String PRIORITY = "PRIORITY";
	private static final String EXPRESS = "EXPRESS";
	private static final String COMANY_NAME = "FederalPostalService";
	private Map<String,Tariff> fedTariffs;
	private Map<String,DeliveryPriorityType> fedTariffCodes;
	
	FederalPostalServiceConfig(){
		fedTariffs = new HashMap<String,Tariff>();
		fedTariffs.put(DeliveryPriorityType.FIRST.toString(),(Tariff) new TariffImpl(EXPRESS, 0.44,"24 hours"));
		fedTariffs.put(DeliveryPriorityType.SECOND.toString(),(Tariff) new TariffImpl(PRIORITY, 0.15,"1 to 3 Business Days"));
		fedTariffs.put(DeliveryPriorityType.WHENEVER.toString(),(Tariff) new TariffImpl(REGULAR, 0.02,"4 to 5 Business Days"));
		
		fedTariffCodes = new HashMap<String,DeliveryPriorityType>();
		fedTariffCodes.put(EXPRESS,DeliveryPriorityType.FIRST);
		fedTariffCodes.put(PRIORITY,DeliveryPriorityType.SECOND);
		fedTariffCodes.put(REGULAR,DeliveryPriorityType.WHENEVER);

	}

	
	
	@Bean(name="fedTariffCodes")
	public Map<String,DeliveryPriorityType> getFedTariffCodes(){		
		return fedTariffCodes;
	}

	@Bean(name="federalPostalService")
	public PostalCarrier getFederalPostalService(){
		return new FederalPostalService(fedTariffs,COMANY_NAME);
	}
}
