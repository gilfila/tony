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

import com.jits.configuration.UnitedExpressConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=UnitedExpressConfig.class)
public class UnitedExpressServiceTest {
	@Inject
	@Resource(name="unitedExpress")
	private PostalCarrier ue;
	
	
	@Test
	public void canBuildFedPostalService(){
		assertThat(ue, notNullValue());
	}

	@Test
	public void canRetrieveTariffFactorFIRST(){
		assertThat(ue.retrieveTariffFactor(DeliveryPriorityType.FIRST), is(0.3));
	}
	@Test
	public void canRetrieveTariffFactorSECOND(){
		assertThat(ue.retrieveTariffFactor(DeliveryPriorityType.SECOND), is(0.15));
	}
	@Test
	public void canRetrieveTariffFactorWHENEVER(){
		assertThat(ue.retrieveTariffFactor(DeliveryPriorityType.WHENEVER), is(0.05));
	}
	@Test
	public void canRetrieveDeliveryTypeFIRST(){
		assertThat(ue.retrieveDeliveryPriorityType("FRST"), is(DeliveryPriorityType.FIRST));
	}
	@Test
	public void canRetrieveDeliveryTypeSECOND(){
		assertThat(ue.retrieveDeliveryPriorityType("SEC"), is(DeliveryPriorityType.SECOND));
	}
	@Test
	public void canRetrieveDeliveryTypeWHENVER(){
		assertThat(ue.retrieveDeliveryPriorityType("OTHER"), is(DeliveryPriorityType.WHENEVER));
	}
}
