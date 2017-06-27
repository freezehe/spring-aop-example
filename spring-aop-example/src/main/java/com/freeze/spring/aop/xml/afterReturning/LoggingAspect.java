package com.freeze.spring.aop.xml.afterReturning;


/**
 * Spring AOP Before Advice Example
 * 
 * Learn to configure aop before advice aspect using <aop:before/>
 * configuration.
 * 
 * @author he_jiebing
 *
 */
public class LoggingAspect {

	public void logAfterReturingAllMethods(Object retVal) throws Throwable {
		System.out.println("****LoggingAspect.logAfterReturingAllMethods() "+ retVal);
	}

}
