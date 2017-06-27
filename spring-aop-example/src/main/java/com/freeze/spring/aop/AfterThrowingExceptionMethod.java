package com.freeze.spring.aop;

import org.springframework.aop.ThrowsAdvice;

public class AfterThrowingExceptionMethod implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out
				.println("===SPRING AOP=== AfterThrowingExceptionMethod : Execute when method throws exception");
	}
}