package com.jits.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;

import com.corporate.core.Discount;

public class DiscountEvent extends ApplicationEvent {
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory
			.getLogger(DiscountEvent.class);
	public DiscountEvent(Object source) {
		super(source);
		LOGGER.info("I have changed discount code:" + ((Discount)source).getCode());
	}

	
}
