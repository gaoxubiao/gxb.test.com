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
    System.err.println("******************������ģʽ*****************************");
    IntefaceAdapter b=new ImpB();
    b.method4();
    System.err.println("*******************װ��ģʽ*****************************");
    DeatorInterface s=new Sources1();
    DeratorModel d=new DeratorModel(s);
    d.datorTest();
    System.err.println("******************************************************");
    
    DeatorInterface poxy= new SourcePoxy();
    poxy.datorTest();
  
    
    
    System.err.println("*****************���ģʽ����������ͬһ���࣬������϶�*******************");
    Computer com=new Computer();
    com.start();
    com.shutdown();
    
    
    System.err.println("*************�Ž�ģʽjdbc  ʹ�þ����Ž�ģʽ���ݲ�������ʹ�ò�ͬ�����ݿ�ʵ��********************");
           //���������
        BridgeModelAbstract bridgeAbstact= new BridgeTest();
          //�ӿ�ʵ����1---�൱��jdbc ��һ��sqlʵ��
        BridgeInterface bridge1=new SourceModelBridge1();
        bridgeAbstact.setBridge(bridge1);
        bridgeAbstact.bridgeModelTest();
        
        //�ӿ�ʵ����2---�൱��jdbc�ĵڶ���sqlʵ��
        BridgeInterface bridge2=new SourceModelBridge2();
        bridgeAbstact.setBridge(bridge2);
        bridgeAbstact.bridgeModelTest();
	}

}
