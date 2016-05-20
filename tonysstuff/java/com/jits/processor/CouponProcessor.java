package com.jits.processor;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import com.corporate.core.Discount;


public class CouponProcessor implements BeanPostProcessor {

	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(CouponProcessor.class);
	@Autowired
	AbstractApplicationContext ctxt;
	
 
	Map<String,String> discountCodeXref;

	 
	@Override
	public Object postProcessAfterInitialization(Object arg0In, String arg1In)
			throws BeansException {
		
		LOGGER.info("Bean passed through post process of type:" + arg0In.getClass());
		LOGGER.info(arg0In.getClass().getName());
		if(arg0In instanceof Discount){
			Object source = arg0In;
			String originalCode = ((Discount)source).getCode();
			String kioskCode = discountCodeXref.get(originalCode);
			((Discount)source).setCode(kioskCode);
			LOGGER.info("Code:" + originalCode + " replaced with: " + kioskCode);
			ApplicationEvent event = new DiscountEvent(source);
			ctxt.publishEvent(event);			
		}
		return arg0In;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0In, String arg1In)
			throws BeansException {
		return arg0In;
	}

	public void setDiscountCodeXRef(Map<String, String> discountCodeXrefIn) {
		this.discountCodeXref = discountCodeXrefIn;
		
	}

}
