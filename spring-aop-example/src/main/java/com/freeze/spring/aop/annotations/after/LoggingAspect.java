package com.freeze.spring.aop.annotations.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 
 * @author he_jiebing
 *
 */
@Aspect
@Component
public class LoggingAspect {

	@After("execution(* com.freeze.spring.aop.annotations.after.EmployeeManagerImpl.*(..))")
	public void logAfterAllMethods(JoinPoint joinPoint) {
		 System.out.println("****LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.freeze.spring.aop.annotations.after.EmployeeManagerImpl.getEmployeeById(..))")
	public void logAfterGetEmployee(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logAfterGetEmployee() "
				+ joinPoint.getSignature().getName());
	}
	
	@After("execution(* com.freeze.spring.aop.annotations.after.EmployeeManagerImpl.createEmployee(..))")
    public void logAfterCreateEmployee(JoinPoint joinPoint) 
    {
        System.out.println("****LoggingAspect.logAfterCreateEmployee() : " + joinPoint.getSignature().getName());
    }
}
