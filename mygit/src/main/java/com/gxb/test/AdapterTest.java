package com.gxb.test;


public class AdapterTest {
	public static void main(String[] args) {
		Adapter a=new Adapter();
		a.method1();
		a.method2();

     SourceTest source=new SourceTest();
  Taragetable ta=  new ObjectAdapter(source);
  ta.method1();
  ta.method2();
   
    IntefaceAdapter a1=new ImpA();
    a1.method3();
    System.err.println("******************适配器模式*****************************");
    IntefaceAdapter b=new ImpB();
    b.method4();
    System.err.println("*******************装饰模式*****************************");
    DeatorInterface s=new Sources1();
    DeratorModel d=new DeratorModel(s);
    d.datorTest();
    System.err.println("******************************************************");
    
    DeatorInterface poxy= new SourcePoxy();
    poxy.datorTest();
  
    
    
    System.err.println("*****************外观模式将多个类放入同一个类，降低耦合度*******************");
    Computer com=new Computer();
    com.start();
    com.shutdown();
    
    
    System.err.println("*************桥接模式jdbc  使用就是桥接模式根据不过驱动使用不同的数据库实现********************");
           //抽象类对象
        BridgeModelAbstract bridgeAbstact= new BridgeTest();
          //接口实现类1---相当于jdbc 的一种sql实现
        BridgeInterface bridge1=new SourceModelBridge1();
        bridgeAbstact.setBridge(bridge1);
        bridgeAbstact.bridgeModelTest();
        
        //接口实现类2---相当于jdbc的第二种sql实现
        BridgeInterface bridge2=new SourceModelBridge2();
        bridgeAbstact.setBridge(bridge2);
        bridgeAbstact.bridgeModelTest();
	}

}
