package com.freeze.spring.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeMethod implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out
				.println("===SPRING AOP=== BeforeMethod : Execute before method!");
	}
}