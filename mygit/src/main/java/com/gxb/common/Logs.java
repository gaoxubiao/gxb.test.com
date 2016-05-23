package com.gxb.common;

import org.aspectj.lang.JoinPoint;

public class Logs {

	public void logging(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		for (int i = 0; i < args.length; i++) {
			System.err.println("method of args:" + args[i]);
		}
		System.err.println("得到被拦截方法签名:" + joinPoint.getSignature().getName());
		System.err.println("**************logging***************");
	}

	public void logArg(JoinPoint point) {
		// 此方法返回的是一个数组，数组中包括request以及ActionCofig等类对象
		Object[] args = point.getArgs();
		System.out.println("目标参数列表：");
		if (args != null) {
			for (Object obj : args) {
				System.out.println(obj + ",");
			}
		}
	}

	// 有参并有返回值的方法
	public void logArgAndReturn(JoinPoint point, Object returnObj) {
		// 此方法返回的是一个数组，数组中包括request以及ActionCofig等类对象
		Object[] args = point.getArgs();
		System.out.println("目标参数列表：");
		if (args != null) {
			for (Object obj : args) {
				System.out.println(obj + ",");
			}
			System.out.println("执行结果是：" + returnObj);
		}

	}
}
