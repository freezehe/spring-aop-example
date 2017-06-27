package com.freeze.spring.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
		
		SampleService sampleService = (SampleService) context.getBean("sampleServiceProxy");
		
		sampleService.printDetails();
		try {
			sampleService.checkName();
		} catch (Exception e) {
			System.out
					.println("SampleService: Method checkName() thrown exception");
		}
		sampleService.sayHello("JavaTutorials");
		context.close();
	}
}