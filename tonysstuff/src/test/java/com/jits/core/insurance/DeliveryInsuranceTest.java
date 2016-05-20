package com.jits.core.insurance;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DeliveryInsuranceTest {
	
	DeliveryInsurance di;
	
	@Before
	public void setUp(){
		di = new DeliveryInsurance();
	}
	
	@Test
	public void canBuildDeliveryInsurance(){
		assertNotNull(di);		
	}
	
	@Test
	public void canTestGettersSetters(){
		di.setDescription("Test");
		di.setFactor(3);
		assertThat(di.getDescription(), is("Test"));
		assertThat(di.getFactor(), is(3d));
	}
	
	@Test
	public void canAddInsurance(){
		di.setFactor(3);
		assertThat(di.addInsurance(3), is(9d));
		
	}
}
