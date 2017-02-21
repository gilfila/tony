package com.jits.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jits.core.Confirmation;

/**
 * Controller for the JITS application
 */
@Controller
public class JitsController {

	@RequestMapping(value="/tony", method=RequestMethod.GET)
	public String home(HttpServletResponse response) throws IOException{
		return "index";

	}

	@RequestMapping(value="/clickNSay", method=RequestMethod.GET)
	public String clickNSay(HttpServletResponse response) throws IOException{
		return "clickNSay";

	}
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public String photo(HttpServletResponse response) throws IOException{
//		return "gilfillanphotography";
//
//	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String photo(HttpServletResponse response) throws IOException{
		return "gilfillanPhoto";

	}
	@RequestMapping(value="/downloadPDF", method=RequestMethod.GET)
	public ModelAndView pdf(HttpServletResponse response, HttpSession session) throws IOException{
		Map<String,String> reciept = new HashMap<String,String>();
		Confirmation confirm = (Confirmation) session.getAttribute("confirm");		
		return new ModelAndView("pdf", "confirmation", confirm);

	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/inputDelivery", method = RequestMethod.GET)
	public String inputDelivery() {
		return "inputdelivery";
	}
	
}
