package com.gxb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testmvc")
public class UserController {
	/*
	 * 
	 * http://localhost:8080/��Ŀ��/testmvc/controller
	 * */
	@RequestMapping("/controller")
	public String test( String username,String pwd){
		System.err.println("�����"+username);
		return "main";
	}

}
