package com.freeze.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Learn to configure AOP aspects using XML configuration.
 * Spring AOP AspectJ XML Configuration Example
 * @author he_jiebing
 *
 */
public class TestAOP {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-xml.xml");
		
		EmployeeManager manager = ( EmployeeManager ) context.getBean("employeeManager");
		 
        manager.getEmployeeById(1);
         
        manager.createEmployee(new EmployeeDTO());
         
        manager.deleteEmployee(100);
		
	}

}
