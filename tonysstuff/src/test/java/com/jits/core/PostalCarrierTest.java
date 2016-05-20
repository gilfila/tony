package com.jits.core;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jits.core.carrier.Carrier;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class PostalCarrierTest {
	Carrier postalCarrier;
	Carrier postalCarrier2;
	
	@Before
	public void setUp(){
		postalCarrier2 = new PostalCarrier() {

			@Override
			public double retrieveTariffFactor(DeliveryPriorityType dTypeIn) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public DeliveryPriorityType retrieveDeliveryPriorityType(
					String typeIn) {
				// TODO Auto-generated method stub
				return null;
			}
			
			
		};
		postalCarrier = new PostalCarrier(null,"Test") {

			@Override
			public double retrieveTariffFactor(DeliveryPriorityType dTypeIn) {
				return 0;
			}

			@Override
			public DeliveryPriorityType retrieveDeliveryPriorityType(
					String typeIn) {
				return null;
			}
			
		};
	}
	
	@Test
	public void canBuildPostalCarrier(){
		assertNotNull(postalCarrier);
	}

	@Test
	public void canRetrieveTarrifFactor(){
		assertThat(postalCarrier.retrieveTariffFactor(null), equalTo(0d));
		assertThat(postalCarrier2.retrieveTariffFactor(null), equalTo(0d));
	}
	@Test
	public void canGetSetName(){

		assertThat(postalCarrier.getName(), equalTo("Test"));
	}
	@Test
	public void canGetSetTariffs(){
		assertThat(postalCarrier.getTariffs(), equalTo(null));
		
	}
	@Test
	public void canRetrieveDeliveryPriorityType(){
		assertThat(postalCarrier.retrieveDeliveryPriorityType(""), equalTo(null));
		assertThat(postalCarrier2.retrieveDeliveryPriorityType(""), equalTo(null));
	}
	@Test
	public void canUseTrivialGettersAndSetters(){
		assertThat(postalCarrier.getName(), is("Test"));
		assertThat(postalCarrier.getTariffs(),nullValue());
	}
}
