package com.gxb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testmvc")
public class UserController {
	/*
	 * 
	 * http://localhost:8080/项目名/testmvc/controller
	 * */
	@RequestMapping("/controller")
	public String test( String username,String pwd){
		System.err.println("输出："+username);
		return "main";
	}

}
