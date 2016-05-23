package com.gxb.test;



/*
 * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，
 * 像我们常用的JDBC桥DriverManager一样，JDBC进行连接数据库的时候，
 * 在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不用动，
 * 原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了
 * 1.创建接口
 * 2.创建抽象类将接口作为成员变量，实现接口方法，在接口方法中调用接口方法
 * 3.创建类继承抽象类
 * 多个实现类分别实现该接口
 * 4.测试创建继承抽象类的子类，然后设置接口在调用
 * 
 * */
public class BridgeTest extends BridgeModelAbstract {

	@Override
	public void bridgeModelTest() {
       getBridge().bridgeModelTest();
	}
}
