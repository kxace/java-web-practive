package com.seanco.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same Bean
		boolean result = theCoach == alphaCoach;
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory address for theCoach: " + theCoach);
		System.out.println("\nMemory address for alphaCoach:" + alphaCoach);
		
		context.close();
		
	}

}
