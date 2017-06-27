package com.freeze.spring;

import org.springframework.aop.framework.ProxyFactory;

public class MainClass {
	
	public static void main(String[] args) {
		//Pojo pojo = new SamplePojo();
		//pojo.foo();
		
		ProxyFactory factory = new ProxyFactory(new SamplePojo());
		factory.addInterface(Pojo.class);
       // factory.addAdvice(new RetryAdvice());
        Pojo pojo = (Pojo) factory.getProxy();
        pojo.foo();
		
	}

}
