package com.gxb.common;

import java.io.File;

import org.junit.Test;

public class FileUtils {
	File file = null;
	File[] fileList = null;

	public void getFile(String url) {
		File file=new File(url);
		File[]fileList=file.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isDirectory()) {
				getFile(fileList[i].getAbsolutePath());
			} else if(fileList[i].isFile()){
				if(fileList[i].getAbsolutePath().contains("6e5dbc0768d3de024b96eebccfd209fe")){
					if(!fileList[i].getAbsolutePath().endsWith(".nomedia") ){
				          System.err.println("Êä³öÎÄ¼þ£º" + fileList[i].getAbsolutePath()+">>>>>>>>>==name="+fileList[i].getName());
					}
			}
		}
		}
	}
	@Test
	public void test() {
		file = new File("F:\\sd2\\");
		fileList = file.listFiles();
		getFile(file.getAbsolutePath());
	}

}
