package com.gxb.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileReadWrite {
	private static String path = "tomcat配置.txt";
	/*
	 * 按字节读取文件,在IO中较慢
	 */
	public static void readFileByByte(String filepath) {
		System.err.println("***********字节读取文件******start********");
		long start=System.nanoTime();
		File file = new File(filepath);
		InputStream readDiskToMemory = null;
		OutputStream memoryToDisk=null;
		try {
			readDiskToMemory = new FileInputStream(file);
			memoryToDisk=new FileOutputStream("./out_byte.txt");
			int tmp;
			while ((tmp = readDiskToMemory.read()) != -1) {
				//System.out.write(tmp);
				memoryToDisk.write(tmp);
				memoryToDisk.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (readDiskToMemory != null) {
				try {
					System.err.println("***********字节读取文件******start***1111111*****");
					long end=System.nanoTime();
					System.err.println("BYTE时间差："+(long)(end-start));
					memoryToDisk.close();
					readDiskToMemory.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 * 
	 * 按字符读取文件
	 */
	public static void readFileByCharacter(String filepath) {
		System.err.println("***********字符读取文件******start********");
		long start=System.nanoTime();
		File file = new File(filepath);
		FileReader readFileToMemory = null;
		FileWriter memoryToDisk=null;
		int tmp;
		try {
			readFileToMemory = new FileReader(file);
			memoryToDisk=new FileWriter("./out_char.txt");
			while ((tmp = readFileToMemory.read()) != -1) {
				if ((char) tmp != '\r') {
					memoryToDisk.write(tmp);
					//memoryToDisk.flush();
					//memoryToDisk.append((char)tmp);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (readFileToMemory != null) {
				try {
					System.err.println("***********字符读取文件******end********");
					long end=System.nanoTime();
					System.err.println("CHAR时间差："+(long)(end-start));
					memoryToDisk.close();
					readFileToMemory.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/* 按行读取文件 */
	public static void readFileByBufferReader(String filepath) {
		System.err.println("***********按行读取文件******start********3");
		long start=System.nanoTime();
		File file = new File(filepath);
		BufferedReader readBufferToMemory = null;
		BufferedWriter writeBufferToDisk=null;
		try {
			readBufferToMemory = new BufferedReader(new FileReader(file));
			writeBufferToDisk=new BufferedWriter(new FileWriter("./out_bufferline.txt", true));
			String tmp = null;
			while ((tmp=readBufferToMemory.readLine()) != null) {
				//System.err.println(tmp);
				writeBufferToDisk.write(tmp);
				writeBufferToDisk.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.err.println("***********按行读取文件******end********3");
				long end=System.nanoTime();
				System.err.println("LINE时间差："+(long)(end-start));
				writeBufferToDisk.close();
				readBufferToMemory.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * nio  非阻塞输入输出
	 * */
	public static void readFileByByteBuffer(String filepath){
		System.err.println("*************NIO输入输出****************");
		long start=System.nanoTime();
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream(filepath);
			//向后边最加
			out=new FileOutputStream("./out_nio_buffer.txt",true);
			//获取收入输出通道
			FileChannel channelIn=in.getChannel();
			FileChannel channelOut=out.getChannel();
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			while (true) {
				//clear 重设缓冲区,可以接受读入的数据
				buffer.clear();
				//将输入通道中的数据读入缓冲区
				int r=channelIn.read(buffer);
				if(r==-1){
					break;
				}
				//flip方法可以让缓冲区将新读入的数据写入到另一个通道
				buffer.flip();
				channelOut.write(buffer);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
			if(in!=null && out!=null){
				try {
					long end=System.nanoTime();
					System.err.println("NIO时间差："+(long)(end-start));
					in.close();
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
           
		//FileReadWrite.readFileByBufferReader(path);
		FileReadWrite.readFileByByte(path);
		//FileReadWrite.readFileByCharacter(path);
		//FileReadWrite.readFileByByteBuffer(path);
		}

	}

}
