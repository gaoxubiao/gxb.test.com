package com.gxb.test;

public class Plus extends AbstractCalculate implements Icalculate{

	@Override
	public int calculate(String exp) {
        int [] arrayInt=split(exp, "\\+");
		return arrayInt[0]+arrayInt[1];
	}

}
