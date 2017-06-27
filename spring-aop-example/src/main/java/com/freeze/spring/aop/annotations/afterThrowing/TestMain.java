package com.freeze.spring.aop.annotations.afterThrowing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 	Spring AOP After Throwing Advice Example

	Learn to configure aop after throwing advice aspect using <aop:after-throwing/> configuration.
 * @author he_jiebing
 *
 */

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"afterThrowing-annotations.xml");
		EmployeeManager manager = (EmployeeManager) context
				.getBean("employeeManager");

		manager.getEmployeeById(1);
		manager.createEmployee(new EmployeeDTO());
	}

}
