package com.gxb.test;


/*
 * ���ģʽ��Facade��

���ģʽ��Ϊ�˽��������֮�ҵ�������ϵ�ģ���springһ�������Խ������֮��Ĺ�ϵ���õ������ļ��У�
�����ģʽ���ǽ����ǵĹ�ϵ����һ��Facade���У�����������֮�����϶ȣ���ģʽ��û���漰���ӿ�
 * 
 * */
public class Computer {
	private CPU cpu;
	private Disk disk;
	private Memory memory;
	
	
	public Computer() {
		super();
		cpu=new CPU();
		disk=new Disk();
		memory=new Memory();
	}
	public void start(){
		System.err.println("����computer....");
		cpu.start();
		memory.start();
		disk.start();
		
	}
	public void shutdown(){
		System.err.println("�ر�computer...");
		 disk.shutdown();
		 memory.shutdown();
		 cpu.shutdown();
	}

}
