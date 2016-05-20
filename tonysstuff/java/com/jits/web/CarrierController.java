package com.jits.web;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
//import javax.validation.constraints.DecimalMax;
//import javax.validation.constraints.DecimalMin;
//import javax.validation.constraints.Pattern;

import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.corporate.core.Discount;
import com.jits.configuration.StateCodeValidator;
import com.jits.core.DeliveryPO;
import com.jits.core.DeliveryType;
import com.jits.core.IDeliveryPO;
import com.jits.core.KioskImpl;
import com.jits.core.carrier.Carrier;
import com.jits.core.insurance.Insurable;

/**
 * Controller for the JITS application
 */
@Controller
public class CarrierController {

	@Autowired
	KioskImpl kiosk;

	@Autowired
	RouteValidator validator;

	@ModelAttribute("carriers")
	public List<Carrier> getCarriers() {

		return kiosk.getCarriers();

	}

	@RequestMapping(value = "/carrier", method = RequestMethod.GET)
	public String selectCarrier() {
		return "carrier";
	}

	@RequestMapping(value = "/carrier", method = RequestMethod.POST)
	public ModelAndView selectedCarrier(@RequestParam("submit") String carrier,
			@ModelAttribute("delfrm") DeliveryForm deliveryForm,
			BindingResult result) {
		ModelAndView mav = new ModelAndView("inputdelivery");
		mav.addObject("carrier", kiosk.getCarrier(carrier));
		mav.addObject("deliveryTypes", DeliveryType.values());
		List<Discount> discounts = kiosk.getDiscounts();
		List<String> values = new ArrayList<String>();
		for(Discount cur: discounts){
			values.add(cur.getCode());
		}
		mav.addObject("discountCodes", values);
		return mav;
	}
	
	@RequestMapping(value = "/addInsurance", method = RequestMethod.POST)
	public ModelAndView addInsurance(@RequestParam("options") String option) {
		ModelAndView mav = new ModelAndView("confirm");
		kiosk.addInsuranceOption(option);

		mav.addObject("insurance",option);
		return mav;
	}
	
	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
	public ModelAndView resetInsurance(@RequestParam("submit") String submit, HttpSession session) throws FileNotFoundException {
		ModelAndView mav = new ModelAndView("insurance");
		if(submit.equals("Reset")){
			
		}
		else{
			mav.setViewName("end");
			session.setAttribute("confirm", kiosk.confirm());
		}
		
		return mav;
	}

	@RequestMapping(value = "/inputDelivery", method = RequestMethod.POST)
	public ModelAndView inputDelivery(@ModelAttribute("delfrm")@Valid  DeliveryForm deliveryForm,
			BindingResult result, HttpSession session) {
		ModelAndView mav = new ModelAndView("insurance");
		if (result.hasErrors()) {
			mav.setViewName("inputdelivery");
		} else {
			IDeliveryPO poIn = new DeliveryPO();

			
			poIn.setCarrier(kiosk.getSelectedCarrier().getName());
			poIn.setDestCity(deliveryForm.getDestCity());
			poIn.setDestState(deliveryForm.getDestState());
			poIn.setDestStreet(deliveryForm.getDestStreet());
			poIn.setDestZipcode(deliveryForm.getDestZip());
			poIn.setOriginCity(deliveryForm.getOriginCity());
			poIn.setOriginState(deliveryForm.getOriginState());
			poIn.setOriginStreet(deliveryForm.getOriginStreet());
			poIn.setOriginZipcode(deliveryForm.getOriginZip());
			poIn.setDiscountCode(deliveryForm.getDiscountCode());
			poIn.setPriority(deliveryForm.getPriority());
			poIn.setWeight(Double.parseDouble(deliveryForm.getWeight()));
			poIn.setType(deliveryForm.getDeliveryType());

			// validator.validate(poIn, result);

			if (result.hasErrors()) {
				mav.setViewName("inputdelivery");
			}

			session.setAttribute("delivery", kiosk.createJitsDelivery(poIn));
			kiosk.getDelivery().calculateCost();
			session.setAttribute("po", poIn);
			session.setAttribute("insOptions", kiosk.getInsurables());
			session.setAttribute("cost", "$" + kiosk.getDelivery().getCost());
		}
		session.setAttribute("carrier", kiosk.getSelectedCarrier());
		mav.addObject("deliveryTypes", DeliveryType.values());
		return mav;
	}
	
	

	public static class DeliveryForm {

		@Pattern(regexp = "[0-9]{5}", message = "Destination Zip Must be 5 digits")
		private String destZip;
		@Pattern(regexp = "[0-9]{5}", message = "Origin Zip Must be 5 digits")
		private String originZip;
		private String destStreet;
		private String originStreet;
		@Pattern(regexp = "^([Aa][LKSZRAEPlkszraep]|[Cc][AOTaot]|[Dd][ECec]|[Ff][LMlm]|[Gg][AUau]|[Hh][Ii]|[Ii][ADLNadln]|[Kk][SYsy]|[Ll][Aa]|[Mm][ADEHINOPSTadehinopst]|[Nn][CDEHJMVYcdehjmvy]|[Oo][HKRhkr]|[Pp][ARWarw]|[Rr][Ii]|[Ss][CDcd]|[Tt][NXnx]|[Uu][Tt]|[Vv][AITait]|[Ww][AIVYaivy])$", message = "Destination state abbrev must be 2 Character State")
		private String destState;
		@Pattern(regexp = "^([Aa][LKSZRAEPlkszraep]|[Cc][AOTaot]|[Dd][ECec]|[Ff][LMlm]|[Gg][AUau]|[Hh][Ii]|[Ii][ADLNadln]|[Kk][SYsy]|[Ll][Aa]|[Mm][ADEHINOPSTadehinopst]|[Nn][CDEHJMVYcdehjmvy]|[Oo][HKRhkr]|[Pp][ARWarw]|[Rr][Ii]|[Ss][CDcd]|[Tt][NXnx]|[Uu][Tt]|[Vv][AITait]|[Ww][AIVYaivy])$", message = "Origin state abbrev must be 2 Character State")
		private String originState;
		private String destCity;
		private String originCity;
		private String discountCode;
		@Pattern(regexp = "^[0-9]+(\\.[0-9]+)?$", message = "Weight must be numeric")
		private String weight;
		private String deliveryType;
		private String priority;

		public String getDestZip() {
			return destZip;
		}

		public void setDestZip(String destZipIn) {
			destZip = destZipIn;
		}

		public String getOriginZip() {
			return originZip;
		}

		public void setOriginZip(String originZipIn) {
			originZip = originZipIn;
		}

		public String getDestStreet() {
			return destStreet;
		}

		public void setDestStreet(String destStreetIn) {
			destStreet = destStreetIn;
		}

		public String getOriginStreet() {
			return originStreet;
		}

		public void setOriginStreet(String originStreetIn) {
			originStreet = originStreetIn;
		}

		public String getDestState() {
			return destState;
		}

		public void setDestState(String destStateIn) {
			destState = destStateIn;
		}

		public String getOriginState() {
			return originState;
		}

		public void setOriginState(String originStateIn) {
			originState = originStateIn;
		}

		public String getDestCity() {
			return destCity;
		}

		public void setDestCity(String destCityIn) {
			destCity = destCityIn;
		}

		public String getOriginCity() {
			return originCity;
		}

		public void setOriginCity(String originCityIn) {
			originCity = originCityIn;
		}

		public String getWeight() {
			return weight;
		}

		public void setWeight(String weightIn) {
			weight = weightIn;
		}

		public String getDeliveryType() {
			return deliveryType;
		}

		public void setDeliveryType(String deliveryTypeIn) {
			deliveryType = deliveryTypeIn;
		}

		public String getPriority() {
			return priority;
		}

		public void setPriority(String priorityIn) {
			priority = priorityIn;
		}

		public String getDiscountCode() {
			return discountCode;
		}

		public void setDiscountCode(String discountCodeIn) {
			discountCode = discountCodeIn;
		}

	}

}
