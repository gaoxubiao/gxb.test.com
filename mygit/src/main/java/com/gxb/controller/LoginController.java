package com.gxb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/login")
public class LoginController {
	/*
	 * 在Controller中使用redirect方式处理请求
	 * */
	@RequestMapping("/redircet")
	public String testRedircet(){
		
		return "redircet:login";
	}

}
