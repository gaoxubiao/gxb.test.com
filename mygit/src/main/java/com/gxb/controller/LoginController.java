package com.gxb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/login")
public class LoginController {
	/*
	 * ��Controller��ʹ��redirect��ʽ��������
	 * */
	@RequestMapping("/redircet")
	public String testRedircet(){
		
		return "redircet:login";
	}

}
