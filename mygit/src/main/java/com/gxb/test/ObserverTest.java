package com.gxb.test;

public class ObserverTest {

	
	
	public static void main(String[] args) {
		Subject s=  new MySubject();
		s.add(new Observer1());
		s.add(new Observer2());
		s.operation();
		
	}
}
