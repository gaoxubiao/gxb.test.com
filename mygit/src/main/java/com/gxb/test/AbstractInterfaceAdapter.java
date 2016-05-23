package com.gxb.test;


/*
 * 
 * 通过抽象类实现接口方法，根据所需方法具体实现的类来继承该抽象类
 * */
public abstract class AbstractInterfaceAdapter implements IntefaceAdapter {

	@Override
	public void method4() {
		System.err.println("通过抽象类实现的接口方法----4");
	}

	@Override
	public void method1() {
		System.err.println("通过抽象类实现的接口方法----1");
		
	}
	

	@Override
	public void method3() {
		System.err.println("通过抽象类实现的接口方法----3");
	}

	@Override
	public void method2() {
		System.err.println("通过抽象类实现的接口方法----2");
		
	}
	
	

}
