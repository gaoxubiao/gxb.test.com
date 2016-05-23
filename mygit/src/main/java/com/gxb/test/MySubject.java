package com.gxb.test;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.err.println("update self");
		notifyObservers();
	}

}
