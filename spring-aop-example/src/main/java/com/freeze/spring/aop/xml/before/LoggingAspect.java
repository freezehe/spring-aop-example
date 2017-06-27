package com.freeze.spring.aop.xml.before;

import org.aspectj.lang.JoinPoint;
/**
 * Spring AOP Before Advice Example

	Learn to configure aop before advice aspect using <aop:before/> configuration.
 * @author he_jiebing
 *
 */
public class LoggingAspect {

	public void logBeforeAllMethods(JoinPoint jp) throws Throwable {
		System.out.println("****LoggingAspect.logBeforeAllMethods() "
				+ jp.getSignature().getName());
	}

}
