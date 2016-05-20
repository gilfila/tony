package com.jits.core;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jits.configuration.FederalPostalServiceConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={FederalPostalServiceConfig.class})
public class FederalPostalServiceTest {
	@Inject
	@Resource(name="federalPostalService")
	private PostalCarrier fed;
	
	@Test
	public void canBuildFedPostalService(){
		assertThat(fed, notNullValue());
		fed.setTariffs(fed.getTariffs());
	}

	@Test
	public void canSetName(){
		
		fed.setName("Test");
		assertThat(fed.getName(), is("Test"));
	}
	



	@Test
	public void canRetrieveTariffFactorFirst(){
		assertThat(fed.retrieveTariffFactor(DeliveryPriorityType.FIRST), is(0.44));
	}
	@Test
	public void canRetrieveTariffFactorSecond(){
		assertThat(fed.retrieveTariffFactor(DeliveryPriorityType.SECOND), is(0.15));
	}
	@Test
	public void canRetrieveTariffFactorWhenever(){
		assertThat(fed.retrieveTariffFactor(DeliveryPriorityType.WHENEVER), is(0.02));
	}
	@Test
	public void canRetrieveDeliveryTypeFIRST(){
		assertThat(fed.retrieveDeliveryPriorityType("EXPRESS"), is(DeliveryPriorityType.FIRST));
	}
	@Test
	public void canRetrieveDeliveryTypeSECOND(){
		assertThat(fed.retrieveDeliveryPriorityType("PRIORITY"), is(DeliveryPriorityType.SECOND));
	}
	@Test
	public void canRetrieveDeliveryTypeOTHER(){
		assertThat(fed.retrieveDeliveryPriorityType("REGULAR"), is(DeliveryPriorityType.WHENEVER));
	}
	
}
