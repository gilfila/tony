package com.jits.core;

import java.io.FileNotFoundException;
import java.util.List;

import com.corporate.core.Discount;
import com.jits.core.carrier.Carrier;
import com.jits.core.insurance.Insurable;

public interface Kiosk {
	public List<Carrier> getCarriers();
	public List<Discount> getDiscounts();
	public Discount getDiscount(String key);
	public JitsDelivery createJitsDelivery(IDeliveryPO po);
	public void addInsuranceOption(String option);
	public Confirmation confirm() throws FileNotFoundException;
	public List<Insurable> getInsurables();
	public JitsDelivery getDelivery();
	public Confirmation getConfirmation();
	public Carrier getCarrier(String carrierName);
	public Carrier getSelectedCarrier();
}
