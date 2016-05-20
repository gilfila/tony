package com.jits.core;


public class DeliveryPO implements IDeliveryPO {
	private String originStreet;
	private String originCity;
	private String originState;
	private String originZipcode;
	private String destStreet;
	private String destCity;	
	private String destState;
	private String destZipcode;
	private String type;
	private double weight;
	private String carrier;
	private String priority;
	private String discountCode;
	
	public DeliveryPO(){
		
	}
	
//	public DeliveryPO(String originStreetIn, String originCityIn,
//			String originStateIn, String originZipcodeIn, String destStreetIn,
//			String destCityIn, String destStateIn, String destZipcodeIn,
//			String typeIn, double weightIn, String carrierIn,
//			String priorityIn, String discountCodeIn) {
//		super();
//		originStreet = originStreetIn;
//		originCity = originCityIn;
//		originState = originStateIn;
//		originZipcode = originZipcodeIn;
//		destStreet = destStreetIn;
//		destCity = destCityIn;
//		destState = destStateIn;
//		destZipcode = destZipcodeIn;
//		type = typeIn;
//		weight = weightIn;
//		carrier = carrierIn;
//		priority = priorityIn;
//		discountCode = discountCodeIn;
//	}
//	
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getOriginStreet()
	 */
	@Override
	public String getOriginStreet() {
		return originStreet;
	}
	@Override
	public void setOriginStreet(String originStreetIn) {
		originStreet = originStreetIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getOriginCity()
	 */
	@Override
	public String getOriginCity() {
		return originCity;
	}
	@Override
	public void setOriginCity(String originCityIn) {
		originCity = originCityIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getOriginState()
	 */
	@Override
	public String getOriginState() {
		return originState;
	}
	@Override
	public void setOriginState(String originStateIn) {
		originState = originStateIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getOriginZipcode()
	 */
	@Override
	public String getOriginZipcode() {
		return originZipcode;
	}
	@Override
	public void setOriginZipcode(String originZipcodeIn) {
		originZipcode = originZipcodeIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getDestCity()
	 */
	@Override
	public String getDestCity() {
		return destCity;
	}
	@Override
	public void setDestCity(String destCityIn) {
		destCity = destCityIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getDestState()
	 */
	@Override
	public String getDestState() {
		return destState;
	}
	@Override
	public void setDestState(String destStateIn) {
		destState = destStateIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getDestZipcode()
	 */
	@Override
	public String getDestZipcode() {
		return destZipcode;
	}
	@Override
	public void setDestZipcode(String destZipcodeIn) {
		destZipcode = destZipcodeIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getType()
	 */
	@Override
	public String getType() {
		return type;
	}
	@Override
	public void setType(String typeIn) {
		type = typeIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getWeight()
	 */
	@Override
	public double getWeight() {
		return weight;
	}
	@Override
	public void setWeight(double weightIn) {
		weight = weightIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getCarrier()
	 */
	@Override
	public String getCarrier() {
		return carrier;
	}
	@Override
	public void setCarrier(String carrierIn) {
		carrier = carrierIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getPriority()
	 */
	@Override
	public String getPriority() {
		return priority;
	}
	@Override
	public void setPriority(String priorityIn) {
		priority = priorityIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getDiscountCode()
	 */
	@Override
	public String getDiscountCode() {
		return discountCode;
	}
	@Override
	public void setDiscountCode(String discountCodeIn) {
		discountCode = discountCodeIn;
	}
	/* (non-Javadoc)
	 * @see com.jits.core.IDeliveryPO#getDestStreet()
	 */
	@Override
	public String getDestStreet() {
		return destStreet;
	}
	@Override
	public void setDestStreet(String destStreetIn) {
		destStreet = destStreetIn;
	}
	
}
