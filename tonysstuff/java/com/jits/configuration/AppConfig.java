package com.jits.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.view.XmlViewResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.Resource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.jits.core.Confirmation;
import com.jits.core.DeliveryPO;
import com.jits.core.KioskImpl;
import com.jits.core.insurance.DeliveryInsurance;
import com.jits.core.insurance.Insurable;
import com.jits.processor.CouponProcessor;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.jits")
@ImportResource({ "classpath:corporate-context.xml" })

@Import({ FederalPostalServiceConfig.class, UnitedExpressConfig.class })
public class AppConfig extends WebMvcConfigurerAdapter {

	 
	
	@Bean 
	public CouponProcessor processor() {
		CouponProcessor p = new CouponProcessor();
		p.setDiscountCodeXRef(getDiscountCodeXref());
		return p;	
	}
 

	@Bean(name = "kioskInsuranceOptions")
	public List<Insurable> getInsuranceOptions(@Value(value = "#{insuranceOptions}") List<Insurable> filteredList) {
		List<Insurable> options = new ArrayList<Insurable>(filteredList);
		DeliveryInsurance insurance = new DeliveryInsurance();
		insurance.setFactor(0.20);
		insurance.setDescription("Collect on Delivery");
		options.add(insurance);
		DeliveryInsurance insurance2 = new DeliveryInsurance();
		insurance2.setFactor(0.12);
		insurance2.setDescription("Reciept on Delivery");
		options.add(insurance2);
		DeliveryInsurance insurance3 = new DeliveryInsurance();
		insurance3.setFactor(0.05);
		insurance3.setDescription("Restricted Delivery");
		options.add(insurance3);
		return options;
	}

	@Bean(name = "filteredInsuranceOptions")
	public List<Insurable> getFilteredList(@Value(value = "#{kioskInsuranceOptions.?[factor<0.10]}") List<Insurable> filteredList) {
		return filteredList;

	}

	@Bean(name = "kioskImpl")
	public KioskImpl getKiosk() {
		return new KioskImpl();
	}

	@Bean(name = "discountCodeXref")
	public Map<String, String> getDiscountCodeXref() {
		Map<String, String> discountCodeXref = new HashMap<String, String>();
		discountCodeXref.put("ABC05", "IL005");
		discountCodeXref.put("ABC10", "IL010");
		discountCodeXref.put("ABC15", "IL015");
		discountCodeXref.put("ABC25", "IW020");
		discountCodeXref.put("ABC30", "IW030");
		discountCodeXref.put("TOP35", "Unknown");
		return discountCodeXref;
	}
	
	 
	@Bean(name = "jaxbMarshaller")
	public Jaxb2Marshaller jaxb2Marshaller() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	    marshaller.setClassesToBeBound(new Class[]{
	               Confirmation.class
	    });
	    return marshaller;
	}
	

 	@Bean
 	public XmlViewResolver getXMLViewResolver(){
 		XmlViewResolver resolver = new XmlViewResolver();
 		resolver.setOrder(1);
 		return resolver;
 	}
 	
 	@Bean
 	public ViewResolver getViewResolver(){
 		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
 		resolver.setPrefix("/WEB-INF/views/");
 		resolver.setSuffix(".jsp");
 		resolver.setOrder(2);
 		return resolver;
 	}
 	
 	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
 	   registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
 	}
 	
 	@Bean
 	public LocalValidatorFactoryBean validator() {
 	    LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
 	    return validatorFactoryBean;
 	}

 	 @Bean  
     public ResourceBundleMessageSource messageSource() {  
         ResourceBundleMessageSource source = new ResourceBundleMessageSource();  
         source.setBasename("errors/messages");  
         source.setUseCodeAsDefaultMessage(true);  
         return source;  
     }  

}
