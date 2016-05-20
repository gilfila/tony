package com.jits.core;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TariffImplTest {
	TariffImpl tariff;
	
	@Before
	public void setUp(){
		tariff = new TariffImpl("EXPRESS",0.44,"24 hours");
	}
	
	@Test
	public void canBuildTariff(){
		assertNotNull(tariff);
	}
	
	@Test
	public void canTestTrivialGettersSetters(){
		tariff.setCode("PRIORITY");
		tariff.setDuration("5 min");
		tariff.setFactor(.05);
		assertThat(tariff.getCode(), is("PRIORITY"));
		assertThat(tariff.getDuration(), is("5 min"));
		assertThat(tariff.getFactor(), is(.05));
	}
}
