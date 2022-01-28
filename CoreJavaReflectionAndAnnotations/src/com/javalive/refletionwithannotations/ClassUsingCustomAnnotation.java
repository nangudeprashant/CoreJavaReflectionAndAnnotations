package com.javalive.refletionwithannotations;

public class ClassUsingCustomAnnotation {

	@CustomAnnotation(priority = CustomAnnotation.Priority.MEDIUM, author = "AuthorName", status = CustomAnnotation.Status.STARTED)
	public void someMethod() {
		System.out.println("Inside someMethod()........");
	}
}
