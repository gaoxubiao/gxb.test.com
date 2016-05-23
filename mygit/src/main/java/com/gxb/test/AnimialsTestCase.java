package com.gxb.test;

import org.junit.Test;

import com.gxb.interfaces.Ianimails;

public class AnimialsTestCase extends TestCase {
	
	
	
	@Test
	public void test(){
	Ianimails ia=(Ianimails) applicationContext.getBean("anmialsImpl");
	String s=ia.getName("interface ianimials...");
	System.err.println(s);
		
	}
	

}
