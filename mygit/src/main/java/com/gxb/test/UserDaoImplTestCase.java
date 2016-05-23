package com.gxb.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gxb.daoimpl.UserDaoImpl;

public class UserDaoImplTestCase  extends TestCase{
	@Autowired
	private UserDaoImpl userDaoImpl;
	@Ignore
	@Test
	public void test(){
		try {
		List list=	userDaoImpl.queryList("select *from  subject");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void test2(){
		try {
			userDaoImpl.getTableName();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
