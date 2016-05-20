package com.jits.configuration;

import java.util.Map;

import javax.annotation.Resource;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.jits.web.CarrierController;

public class StateCodeConstraintValidator implements ConstraintValidator<StateCodeValidator, CarrierController.DeliveryForm> {


	@Resource(name="discontinuedRoutes")
	Map<String,String> discRoutes;
	private StateCodeValidator st;
	
	@Override
	public void initialize(StateCodeValidator arg0In) {
		st = arg0In;
		
	}

	@Override
	public boolean isValid(CarrierController.DeliveryForm arg0In, ConstraintValidatorContext arg1In) {
		boolean retVal = true;
		String[] badStates =  discRoutes.get(arg0In.getOriginState().toUpperCase()).split("-");
		
		for(String cur:badStates){
			if(cur.equals(arg0In.getDestState().toUpperCase())){
				retVal = false;
				
			}
		}
		return retVal;
	}

}
