package com.gxb.test;

public class SingletonB {
	private static SingletonB singletonB=null;
	private SingletonB(){
	}
	private static synchronized void syncInit(){
		if(singletonB==null){
			singletonB=new SingletonB();
		}
	}
	public static SingletonB getInstance(){
		if(singletonB==null){
			syncInit();
		}
		return singletonB;
		
	}

}
