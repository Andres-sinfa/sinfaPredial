package com.predial.anotacion;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateRange {
	public boolean update() default true; 
	public String until() default "1500-01-01";
	public String since() default "3500-12-31"; 
}
