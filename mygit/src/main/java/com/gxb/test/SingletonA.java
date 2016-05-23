package com.gxb.test;


/*
 * 
 * synchronized�ؼ�����ס�����������
 * �������÷����������ϻ������½�����Ϊÿ�ε���getInstance()��
 * ��Ҫ�Զ�����������ʵ�ϣ�ֻ���ڵ�һ�δ��������ʱ����Ҫ������֮��Ͳ���Ҫ��
 * 
 * */
public class SingletonA {
	private static SingletonA singletonA = null;

	private SingletonA() {

	}
	public static synchronized SingletonA getInstance() {
		if (singletonA == null) {
			singletonA = new SingletonA();
		}
		return singletonA;

	}

}
