package com.freeze.spring.aop.annotations.before;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Spring AOP Before Advice Example
 * 
 * Learn to configure aop before advice aspect using <aop:before/>
 * configuration.
 * 
 * @author he_jiebing
 *
 */
@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* com.freeze.spring.aop.annotations.before.EmployeeManagerImpl.*(..))")
	public void logBeforeAllMethods(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logBeforeAllMethods() : "
				+ joinPoint.getSignature().getName());
	}

	@Before("execution(* com.freeze.spring.aop.annotations.before.EmployeeManagerImpl.getEmployeeById(..))")
	public void logBeforeGetEmployee(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logBeforeGetEmployee() : "
				+ joinPoint.getSignature().getName());
	}

	@Before("execution(* com.freeze.spring.aop.annotations.before.EmployeeManagerImpl.createEmployee(..))")
	public void logBeforeCreateEmployee(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logBeforeCreateEmployee() : "
				+ joinPoint.getSignature().getName());
	}
}
