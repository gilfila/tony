package com.jits.core;

import com.jits.core.carrier.Tariff;

public class TariffImpl implements Tariff {
	private String code;
	private double factor;
	private String duration;
	
	public TariffImpl(String codeIn, double factorIn, String durationIn){
		code = codeIn;
		factor = factorIn;
		duration = durationIn;
	}

	@Override
	public double getFactor() {
		return factor;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String codeIn) {
		code = codeIn;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String durationIn) {
		duration = durationIn;
	}

	public void setFactor(double factorIn) {
		factor = factorIn;
	}
	

}
