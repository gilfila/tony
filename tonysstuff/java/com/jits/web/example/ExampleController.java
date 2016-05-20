package com.jits.web.example;

//import java.text.DateFormat;
//import java.util.Date;
//import java.util.Locale;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.slf4j.Logger;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import sf.icptp.springextensions.errorhandling.CommonLoggers;
//
//import com.jits.exception.example.ApplicationSpecificException;
//
///**
// * This is an example Spring controller that handles requests for the
// * application home page. This controller contains examples of logging and
// * exception handling according to ICP standards and guidelines. State Farm
// * written exception handling and logging code is located in the
// * spring-namespace-1.0.5.RELEASE.jar library.
// */
//@Controller
//public class ExampleController {
//
//	/**
//	 * The CommonLoggers class is a State Farm written class that returns an
//	 * SLF4J logger. It can be used to create a business logger that logs
//	 * business events, or a security logger that logs security events.
//	 */
//	private static final Logger LOGGER = CommonLoggers
//			.getBusinessLogger(ExampleController.class);
//
//	private static final Logger SECURITY_LOGGER = CommonLoggers
//			.getSecurityLogger(ExampleController.class);
//
//	/**
//	 * Renders the example home view (example_home.jsp).
//	 */
//	@RequestMapping(value = "/example", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		LOGGER.info("In home method in ExampleController. The client locale is "
//				+ locale.toString());
//
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
//				DateFormat.LONG, locale);
//
//		String formattedDate = dateFormat.format(date);
//
//		model.addAttribute("serverTime", formattedDate);
//		
//		SECURITY_LOGGER.info("This message is logged to the audit-security.log file");
//
//		return "example_home";
//	}
//
//	/**
//	 * Example method used to demonstrate a controller GET request.
//	 * 
//	 * @return ModelAndView
//	 */
//	@RequestMapping(value = "/invokeController", method = RequestMethod.GET)
//	public ModelAndView doSomething() {
//		LOGGER.info("In doSomething method in ExampleController.");
//
//		String untrimmedString = " Howdy! ";
//		LOGGER.info("Untrimmed string = '" + untrimmedString + "'");
//
//		BusinessObject businessObject = new BusinessObject();
//
//		String trimmedString = businessObject
//				.removeLeadingAndTrailingSpacesFromString(untrimmedString);
//
//		LOGGER.info("Trimmed string = '" + trimmedString + "'");
//
//		return new ModelAndView("success", "message",
//				"Controller was successfully invoked!");
//	}
//
//	/**
//	 * This method demonstrates the use of the LoggingMappingExceptionResolver
//	 * to handle runtime exceptions before they escape the web container. In
//	 * order for this method to be invoked when a runtime exception is thrown, a
//	 * LoggingMappingExceptionResolver bean must be defined in application
//	 * context xml (see applicationContext-[application name].xml in this
//	 * project).
//	 * 
//	 * @return ModelAndView
//	 */
//	@RequestMapping(value = "/loggingMappingExceptionResolver", method = RequestMethod.GET)
//	public ModelAndView invokeExceptionHandlingUsingLoggingMappingExceptionResolver() {
//		LOGGER.info("In invokeExceptionHandlingUsingLoggingMappingExceptionResolver method in ExampleController.");
//
//		BusinessObject businessObject = new BusinessObject();
//
//		/*
//		 * The following method call should result in a NullPointerException
//		 * being thrown. When the exception is thrown, it is caught and handled
//		 * before it has a chance to exit the container by the
//		 * LoggingMappingExceptionResolver, which is defined in the application
//		 * context file (applicationContext-[application name].xml). The
//		 * LoggingMappingExceptionResolver class logs the exception with a log
//		 * level of ERROR. If the application was running in the production
//		 * environment, logging it as an ERROR would result in a trouble ticket
//		 * being opened to the appropriate support group.
//		 */
//		businessObject.removeLeadingAndTrailingSpacesFromString(null);
//
//		return new ModelAndView("success", "message",
//				"Something went wrong. An unchecked exception should have occurred.");
//	}
//
//	/**
//	 * This method demonstrates the use of the @ExceptionHandler annotation to
//	 * handle runtime exceptions before they escape the web container. In order
//	 * for this method to be invoked when a runtime exception is thrown, the
//	 * servlet-context.xml file must contain these two tags:
//	 * 
//	 * <aop:aspectj-autoproxy />
//	 * 
//	 * <beans:bean id="exceptionHandlerAspect" class="sf.icptp.springextensions.errorhandling.ExceptionHandlerAspect" />
//	 * 
//	 * @return ModelAndView
//	 */
//	@RequestMapping(value = "/exceptionHandlerAnnotation", method = RequestMethod.GET)
//	public ModelAndView invokeExceptionHandlingUsingExceptionHandlerAnnotation() {
//		LOGGER.info("In invokeExceptionHandlingUsingExceptionHandlerAnnotation method in ExampleController.");
//
//		BusinessObject bo = new BusinessObject();
//
//		/*
//		 * The following method call should result in a NumberFormatException
//		 * being thrown. The convertNumericStringToInt method wraps the
//		 * exception in a runtime exception called
//		 * "ApplicationSpecificException", and throws it. As the exception
//		 * bubbles up the call hierarchy, it is intercepted and routed to the
//		 * processApplicationSpecificException method below, which is annotated
//		 * with an @ExceptionHandler annotation. The method should not log the
//		 * exception. The code contained in the @ExceptionHandler annotation
//		 * will log the exception with a level of ERROR.
//		 */
//		bo.convertNumericStringToInt("ABC");
//
//		return new ModelAndView("success", "message",
//				"Something went wrong. An unchecked exception should have occurred.");
//	}
//
//	/**
//	 * This is a custom method that is invoked when an application specific
//	 * runtime exception occurs. The exception is routed to this method when an
//	 * aspect inside the @ExceptionHandler code fires. Routing the exception to
//	 * a custom method makes it possible to perform business logic before the
//	 * error screen is displayed. This method of exception handling is an
//	 * alternative to letting the exception bubble up until it is intercepted by
//	 * the LoggingMappingExceptionResolver and routed to the error screen.
//	 * 
//	 * @param ApplicationSpecificException
//	 * @param HttpServletRequest
//	 * @return ModelAndView
//	 */
//	@ExceptionHandler(ApplicationSpecificException.class)
//	public ModelAndView processApplicationSpecificException(
//			ApplicationSpecificException e, HttpServletRequest request) {
//		LOGGER.info("In processApplicationSpecificException method in ExampleController.");
//
//		String errorMessage = "Caught an application specific exception using the @ExceptionHandler annotation. Nested exception = '"
//				+ e.getCause().getClass() + "'";
//
//		LOGGER.info(errorMessage);
//
//		request.setAttribute("errorMessage", errorMessage);
//		return new ModelAndView("error", "error", e);
//	}
//
//}
