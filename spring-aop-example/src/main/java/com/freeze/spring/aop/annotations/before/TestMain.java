package com.freeze.spring.aop.annotations.before;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Spring AOP Before Advice Example

	Learn to configure aop before advice aspect using <aop:before/> configuration.
 * @author he_jiebing
 *
 */

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"before-annotations.xml");
		EmployeeManager manager = (EmployeeManager) context
				.getBean("employeeManager");

		manager.getEmployeeById(1);
		manager.createEmployee(new EmployeeDTO());
	}

}
