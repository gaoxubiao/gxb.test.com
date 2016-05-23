package com.gxb.common;

import org.aspectj.lang.JoinPoint;

public class Logs {

	public void logging(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		for (int i = 0; i < args.length; i++) {
			System.err.println("method of args:" + args[i]);
		}
		System.err.println("�õ������ط���ǩ��:" + joinPoint.getSignature().getName());
		System.err.println("**************logging***************");
	}

	public void logArg(JoinPoint point) {
		// �˷������ص���һ�����飬�����а���request�Լ�ActionCofig�������
		Object[] args = point.getArgs();
		System.out.println("Ŀ������б�");
		if (args != null) {
			for (Object obj : args) {
				System.out.println(obj + ",");
			}
		}
	}

	// �вβ��з���ֵ�ķ���
	public void logArgAndReturn(JoinPoint point, Object returnObj) {
		// �˷������ص���һ�����飬�����а���request�Լ�ActionCofig�������
		Object[] args = point.getArgs();
		System.out.println("Ŀ������б�");
		if (args != null) {
			for (Object obj : args) {
				System.out.println(obj + ",");
			}
			System.out.println("ִ�н���ǣ�" + returnObj);
		}

	}
}
