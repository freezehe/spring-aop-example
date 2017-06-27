package com.freeze.spring.aop.annotations.after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Spring AOP After Advice Example

	Learn to configure aop after advice aspect using <aop:after/> configuration.
 * @author he_jiebing
 *
 */

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"after-annotations.xml");
		EmployeeManager manager = (EmployeeManager) context
				.getBean("employeeManager");

		manager.getEmployeeById(1);
		manager.createEmployee(new EmployeeDTO());
	}

}
