package com.jits.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.corporate.core.Discount;

@Component
public class DiscountChangeListener implements ApplicationListener<DiscountEvent> {

	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(DiscountChangeListener.class);
	@Override
	public void onApplicationEvent(DiscountEvent arg0In) {
		LOGGER.info("This Code was changed:" + ((Discount)arg0In.getSource()).getCode());
		
	}

}
