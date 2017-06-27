package com.freeze.spring.aop.annotations.afterReturning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Spring AOP After Returning Advice Example

	Learn to configure aop after returning advice aspect using <aop:after-returning/> configuration.
 * @author he_jiebing
 *
 */

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"afterReturning-annotations.xml");
		EmployeeManager manager = (EmployeeManager) context
				.getBean("employeeManager");

		manager.getEmployeeById(1);
		manager.createEmployee(new EmployeeDTO());
	}

}
