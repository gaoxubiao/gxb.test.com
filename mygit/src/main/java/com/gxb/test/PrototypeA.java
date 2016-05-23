package com.gxb.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
      深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * */

public class PrototypeA implements Cloneable,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String str;
	private SerializableObject obj;

	
	/*
	 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
	 * */
	public Object lightClone() throws CloneNotSupportedException{
		PrototypeA prototype=(PrototypeA) super.clone(); 
		return prototype;
		
	}
	public Object deepClone() throws IOException,ClassNotFoundException{
		/* 写入当前对象的二进制流 */  
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		ObjectOutputStream obj=new ObjectOutputStream(bout);
		obj.writeObject(this);
		
		  /* 读出二进制流产生的新对象 */  
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
