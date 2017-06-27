package com.freeze.spring.aop.annotations.afterReturning;

import org.aspectj.lang.annotation.AfterReturning;
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
 
    @AfterReturning("execution(* com.freeze.spring.aop.annotations.afterReturning.EmployeeManagerImpl.*(..))")
    public void logAfterReturningAllMethods() throws Throwable 
    {
        System.out.println("****LoggingAspect.logAfterReturningAllMethods() ");
    }
 
    @AfterReturning(pointcut="execution(* com.freeze.spring.aop.annotations.afterReturning.EmployeeManagerImpl.getEmployeeById(..))", returning="retVal") 
    public void logAfterReturningGetEmployee(Object retVal) throws Throwable 
    {
        System.out.println("****LoggingAspect.logAfterReturningGetEmployee() ");
        System.out.println(((EmployeeDTO)retVal).getId());
    }
 
    @AfterReturning("execution(* com.freeze.spring.aop.annotations.afterReturning.EmployeeManagerImpl.createEmployee(..))")
    public void logAfterReturningCreateEmployee() throws Throwable 
    {
        System.out.println("****LoggingAspect.logAfterReturningCreateEmployee() ");
    }
}
