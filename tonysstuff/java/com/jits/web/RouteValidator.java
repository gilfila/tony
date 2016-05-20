package com.jits.web;


import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jits.core.DeliveryPO;
@Component
public class RouteValidator implements Validator{
	
	@Resource(name="discontinuedRoutes")
	Map<String,String> discRoutes;

	@Override
	public boolean supports(Class<?> clazzIn) {
		return DeliveryPO.class.isAssignableFrom(clazzIn);
	}

	@Override
	public void validate(Object targetIn, Errors errorsIn) {
		DeliveryPO po = (DeliveryPO) targetIn;
		String[] badStates =  discRoutes.get(po.getOriginState()).split("-");
		
		for(String cur:badStates){
			if(cur.equals(po.getDestState())){
				errorsIn.rejectValue("originState", "errors.badRoute");
				
			}
		}
		
		
	}

	

	

}
