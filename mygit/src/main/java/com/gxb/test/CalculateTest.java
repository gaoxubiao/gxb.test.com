package com.gxb.test;

public class CalculateTest {
	public static void main(String[] args) {
		
		
		String exp="3+8";
		
	  Icalculate ca=new Plus();
	  int result= ca.calculate(exp);
	  System.err.println("result:"+result);
	}

}
