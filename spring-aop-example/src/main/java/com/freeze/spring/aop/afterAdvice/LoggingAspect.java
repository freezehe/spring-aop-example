package com.freeze.spring.aop.afterAdvice;

import org.aspectj.lang.JoinPoint;

/**
 * 
 * @author he_jiebing
 *
 */
public class LoggingAspect {

	public void logAfterAllMethods(JoinPoint jp) throws Throwable {
		System.out.println("****LoggingAspect.logBeforeAllMethods() "
				+ jp.getSignature().getName());
	}

}
