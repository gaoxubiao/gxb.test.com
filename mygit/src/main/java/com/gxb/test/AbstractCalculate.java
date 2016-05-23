package com.gxb.test;

public abstract class AbstractCalculate {
	public int[]split(String exp,String opt){
		String []str=exp.split(opt);
		int [] arrayInt =new int[2];
		arrayInt[0]=Integer.parseInt(str[0]);
		arrayInt[1]=Integer.parseInt(str[1]);
		return arrayInt;
		
		
	}

}
