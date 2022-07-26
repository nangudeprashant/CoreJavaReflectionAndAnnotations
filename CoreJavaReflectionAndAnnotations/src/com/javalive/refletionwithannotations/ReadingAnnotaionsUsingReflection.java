package com.javalive.refletionwithannotations;

import java.lang.reflect.Method;

public class ReadingAnnotaionsUsingReflection {
	public static void main(String[] args) {
		Class<ClassUsingCustomAnnotation> classUsingCustomAnnotationObj = ClassUsingCustomAnnotation.class;
		for (Method method : classUsingCustomAnnotationObj.getMethods()) {
			CustomAnnotation todoAnnotation = (CustomAnnotation) method.getAnnotation(CustomAnnotation.class);
			if (todoAnnotation != null) {
				System.out.println(" Method Name : " + method.getName());
				System.out.println(" Author : " + todoAnnotation.author());
				System.out.println(" Priority : " + todoAnnotation.priority());
				System.out.println(" Status : " + todoAnnotation.status());
			}
		}
	}
}

