package com.freeze.spring.aop.xml.afterThrowing;

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

	public void logAfterThrowingAllMethods(Exception ex) throws Throwable {
		System.out.println("****LoggingAspect.logAfterThrowingAllMethods() "+ ex);
	}

}
