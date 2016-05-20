package com.jits.configuration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=StateCodeConstraintValidator.class)
public @interface StateCodeValidator {
	String message() default "Not a Valid Route";
	Class[] groups() default {};
	Class[] payload() default {};
	
	
}
