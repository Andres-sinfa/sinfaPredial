package com.predial.anotacion;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD ,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface OrderDefault {
	public String value() default ""; 
}
