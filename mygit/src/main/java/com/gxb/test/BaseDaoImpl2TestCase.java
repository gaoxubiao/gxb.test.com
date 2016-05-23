package com.gxb.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.gxb.daoimpl.BaseDaoImpl2;

public class BaseDaoImpl2TestCase extends TestCase {
	
	@Resource
	private BaseDaoImpl2 baseDaoImpl2;
	@Test
	public void test(){
		try {
			baseDaoImpl2.queryList("select * from account");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
