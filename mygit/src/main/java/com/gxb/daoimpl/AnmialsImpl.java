package com.gxb.daoimpl;

import org.springframework.stereotype.Component;

import com.gxb.interfaces.Ianimails;

@Component(value="anmialsImpl")
public class AnmialsImpl implements Ianimails{

	
	public String getName(String str) {
       System.err.println("Êä³ö------>>>>>£º"+str);

		return null;
	}

}
