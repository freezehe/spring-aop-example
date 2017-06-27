package com.freeze.spring.aop.xml.around;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 
 * @author he_jiebing
 *
 */
public class LoggingAspect {

	public void logAroundAllMethods(ProceedingJoinPoint pjp) throws Throwable {
		System.out
				.println("****LoggingAspect.logAroundAllMethods() - Before method call");

		pjp.proceed();

		System.out
				.println("****LoggingAspect.logAroundAllMethods() - After method call");
	}

}
