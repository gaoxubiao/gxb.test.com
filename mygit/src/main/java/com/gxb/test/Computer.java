package com.gxb.test;


/*
 * 外观模式（Facade）

外观模式是为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，
而外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度，该模式中没有涉及到接口
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
		System.err.println("启动computer....");
		cpu.start();
		memory.start();
		disk.start();
		
	}
	public void shutdown(){
		System.err.println("关闭computer...");
		 disk.shutdown();
		 memory.shutdown();
		 cpu.shutdown();
	}

}
