package com.freeze.spring.aop.annotations.afterThrowing;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
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

	@AfterThrowing(pointcut = "execution(* com.freeze.spring.aop.annotations.afterThrowing.EmployeeManagerImpl.*(..))", throwing = "ex")
	public void logAfterThrowingAllMethods(Exception ex) throws Throwable {
		System.out.println("****LoggingAspect.logAfterThrowingAllMethods() "
				+ ex);
	}
}
