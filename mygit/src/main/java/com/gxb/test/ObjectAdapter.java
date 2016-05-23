package com.gxb.test;

public class ObjectAdapter implements Taragetable{
	private SourceTest source;
	

	public ObjectAdapter(SourceTest source) {
		super();
		this.source = source;
	}
	@Override
	public void method2() {
          System.err.println("²âÊÔ¶ÔÏóÊÊÅäÆ÷....");
	}
	@Override
	public void method1() {
		source.method1();
	}

}
