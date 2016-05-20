package com.jits.core;

public interface IDeliveryPO {


	public abstract void setDestStreet(String destStreetIn);

	public abstract String getDestStreet();

	public abstract void setDiscountCode(String discountCodeIn);

	public abstract String getDiscountCode();

	public abstract void setPriority(String priorityIn);

	public abstract String getPriority();

	public abstract void setCarrier(String carrierIn);

	public abstract String getCarrier();

	public abstract void setWeight(double weightIn);

	public abstract double getWeight();

	public abstract void setType(String typeIn);

	public abstract String getType();

	public abstract void setDestZipcode(String destZipcodeIn);

	public abstract String getDestZipcode();

	public abstract void setDestState(String destStateIn);

	public abstract String getDestState();

	public abstract void setDestCity(String destCityIn);

	public abstract String getDestCity();

	public abstract void setOriginZipcode(String originZipcodeIn);

	public abstract String getOriginZipcode();

	public abstract void setOriginState(String originStateIn);

	public abstract String getOriginState();

	public abstract void setOriginCity(String originCityIn);

	public abstract String getOriginCity();

	public abstract void setOriginStreet(String originStreetIn);

	public abstract String getOriginStreet();

}