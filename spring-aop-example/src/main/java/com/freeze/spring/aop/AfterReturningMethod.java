package com.freeze.spring.aop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class AfterReturningMethod implements AfterReturningAdvice {
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out
				.println("===SPRING AOP=== AfterReturningMethod : Execute after return method ");
	}
}