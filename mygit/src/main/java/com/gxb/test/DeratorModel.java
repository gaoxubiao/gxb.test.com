package com.gxb.test;



/*
 * װ����ģʽ��Ӧ�ó�����

1����Ҫ��չһ����Ĺ��ܡ�

2����̬��Ϊһ���������ӹ��ܣ����һ��ܶ�̬���������̳в���������һ�㣬�̳еĹ����Ǿ�̬�ģ����ܶ�̬��ɾ����

ȱ�㣺�����������ƵĶ��󣬲����Ŵ�
 * 
 * 
 * */
public class DeratorModel implements DeatorInterface {
	private DeatorInterface source;

	
	public DeratorModel(DeatorInterface source) {
		super();
		this.source = source;
	}



	@Override
	public void datorTest() {
		System.err.println("��װ��ģʽbefore...");
		source.datorTest();
		System.err.println("��װ��ģʽafter...");
		
	}

}
