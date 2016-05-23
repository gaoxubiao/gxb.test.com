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
	private static String path = "tomcat����.txt";
	/*
	 * ���ֽڶ�ȡ�ļ�,��IO�н���
	 */
	public static void readFileByByte(String filepath) {
		System.err.println("***********�ֽڶ�ȡ�ļ�******start********");
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
					System.err.println("***********�ֽڶ�ȡ�ļ�******start***1111111*****");
					long end=System.nanoTime();
					System.err.println("BYTEʱ��"+(long)(end-start));
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
	 * ���ַ���ȡ�ļ�
	 */
	public static void readFileByCharacter(String filepath) {
		System.err.println("***********�ַ���ȡ�ļ�******start********");
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
					System.err.println("***********�ַ���ȡ�ļ�******end********");
					long end=System.nanoTime();
					System.err.println("CHARʱ��"+(long)(end-start));
					memoryToDisk.close();
					readFileToMemory.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/* ���ж�ȡ�ļ� */
	public static void readFileByBufferReader(String filepath) {
		System.err.println("***********���ж�ȡ�ļ�******start********3");
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
				System.err.println("***********���ж�ȡ�ļ�******end********3");
				long end=System.nanoTime();
				System.err.println("LINEʱ��"+(long)(end-start));
				writeBufferToDisk.close();
				readBufferToMemory.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * nio  �������������
	 * */
	public static void readFileByByteBuffer(String filepath){
		System.err.println("*************NIO�������****************");
		long start=System.nanoTime();
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream(filepath);
			//�������
			out=new FileOutputStream("./out_nio_buffer.txt",true);
			//��ȡ�������ͨ��
			FileChannel channelIn=in.getChannel();
			FileChannel channelOut=out.getChannel();
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			while (true) {
				//clear ���軺����,���Խ��ܶ��������
				buffer.clear();
				//������ͨ���е����ݶ��뻺����
				int r=channelIn.read(buffer);
				if(r==-1){
					break;
				}
				//flip���������û��������¶��������д�뵽��һ��ͨ��
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
					System.err.println("NIOʱ��"+(long)(end-start));
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
