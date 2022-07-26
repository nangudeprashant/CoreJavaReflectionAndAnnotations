package com.javalive.refletionwithannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface CustomAnnotation {
	public enum Priority {
		LOW, MEDIUM, HIGH
	}

	public enum Status {
		STARTED, NOT_STARTED
	}

	String author() default "Yash";

	Priority priority() default Priority.LOW;
	
	Status status() default Status.NOT_STARTED;

}
