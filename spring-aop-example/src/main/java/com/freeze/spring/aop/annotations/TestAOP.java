package com.freeze.spring.aop.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-annotations.xml");
		EmployeeManager manager = context.getBean(EmployeeManager.class);

		manager.getEmployeeById(1);
		manager.createEmployee(new EmployeeDTO());
	}

}
