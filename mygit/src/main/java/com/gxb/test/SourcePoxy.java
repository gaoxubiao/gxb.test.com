package com.gxb.test;

/*
 * 代理模式的应用场景：
 * 如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：

 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。

 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。

 使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 * */
public class SourcePoxy implements DeatorInterface {

	private SourceModel source;

	public SourcePoxy() {
		super();
		this.source = new SourceModel();
	}

	@Override
	public void datorTest() {
		before();
		System.err.println("代理模式....");
		source.datorTest();
		after();
	}

	private void before() {
		System.err.println("代理之前...");

	}

	private void after() {
		System.err.println("代理之后...");
	}

}
