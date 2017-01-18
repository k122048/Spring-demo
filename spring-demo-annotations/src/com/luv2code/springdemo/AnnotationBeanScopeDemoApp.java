package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context =  new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theAlphaCoach = context.getBean("tennisCoach",Coach.class); 
		
		Coach theBetaCoach = context.getBean("tennisCoach",Coach.class);
	
	boolean result = (theAlphaCoach == theBetaCoach);
	
	System.out.print("pointing to the same object");
	
	System.out.println("Memory Location of the object alpha >>"+theAlphaCoach);
	
	System.out.println("Memory Location of the object beta>>"+theBetaCoach);

	context.close();
	}

}
