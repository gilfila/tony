package com.jits.core.insurance;


import com.jits.core.insurance.Insurable;

public class DeliveryInsurance implements Insurable {
	private double factor;
	private String description;
	

	@Override
	public double addInsurance(double currentCostIn) {
		return factor * currentCostIn;
	}

	@Override
	public double getFactor() {
		return factor;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String descriptionIn) {
		description = descriptionIn;
	}


	public void setFactor(double factorIn) {
		factor = factorIn;
	}
}
