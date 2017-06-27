package com.freeze.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringTest.class);
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		
		String result = helloWorld.hello();
		
		System.out.println(result);
		
		System.err.println(result);
		
		logger.info("test>>>>>>>>>>>>>>{}",result);
	}

}
