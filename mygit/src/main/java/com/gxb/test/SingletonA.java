package com.gxb.test;


/*
 * 
 * synchronized关键字锁住的是这个对象，
 * 这样的用法，在性能上会有所下降，因为每次调用getInstance()，
 * 都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了
 * 
 * */
public class SingletonA {
	private static SingletonA singletonA = null;

	private SingletonA() {

	}
	public static synchronized SingletonA getInstance() {
		if (singletonA == null) {
			singletonA = new SingletonA();
		}
		return singletonA;

	}

}
