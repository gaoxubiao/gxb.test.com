package com.gxb.test;




/*
 * �ܼ򵥣�һ��ԭ���ֻ࣬��Ҫʵ��Cloneable�ӿڣ�
 * ��дclone�������˴�clone�������Ըĳ���������ƣ���ΪCloneable�ӿ��Ǹ��սӿڣ�
 * ��������ⶨ��ʵ����ķ���������cloneA����cloneB��
 * ��Ϊ�˴����ص���super.clone()��仰��
 * super.clone()���õ���Object��clone()����������Object���У�clone()��native��
 * */
public class Prototype implements Cloneable {

	protected Object testClone() throws CloneNotSupportedException {
		 Prototype prototype=(Prototype) super.clone();   
		 return prototype;
	}

}
