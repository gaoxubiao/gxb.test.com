package com.gxb.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 
 * ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
      ��ƣ���һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´����ġ�����˵��������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ����ס�
 * */

public class PrototypeA implements Cloneable,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String str;
	private SerializableObject obj;

	
	/*
	 * ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
	 * */
	public Object lightClone() throws CloneNotSupportedException{
		PrototypeA prototype=(PrototypeA) super.clone(); 
		return prototype;
		
	}
	public Object deepClone() throws IOException,ClassNotFoundException{
		/* д�뵱ǰ����Ķ������� */  
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		ObjectOutputStream obj=new ObjectOutputStream(bout);
		obj.writeObject(this);
		
		  /* �������������������¶��� */  
		ByteArrayInputStream bin=new ByteArrayInputStream(bout.toByteArray());
		ObjectInputStream objin=new ObjectInputStream(bin);
		return objin.readObject();
		
	}
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public SerializableObject getObj() {
		return obj;
	}
	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
	class SerializableObject implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
}
