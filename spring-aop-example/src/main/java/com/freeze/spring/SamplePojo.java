package com.freeze.spring;

public class SamplePojo implements Pojo{

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		this.bar();
		
		System.out.println("foo.........");
		
	}

	@Override
	public void bar() {
		// TODO Auto-generated method stub
		
		System.out.println("bar.........");
		
	}

}
