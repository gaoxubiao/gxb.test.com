package com.gxb.test;

import java.util.Enumeration;

import org.apache.commons.collections.EnumerationIterator;

import antlr.collections.Enumerator;


/*
 * ���ģʽ��ʱ�ֽв���-����ģʽ�ڴ����������νṹ������ʱ�ȽϷ��㣬������ϵͼ��
 * ʹ�ó�������������������һ����в����������ڱ�ʾ���νṹ�У���������������ȡ�
 * */
public class Tree {
	private TreeNode root=null;

	public Tree(String name) {
		root=new TreeNode(name);
	}
	
	public static void main(String[] args) {
		
		Tree rootT=new Tree("rootName");
		TreeNode node1=new TreeNode("A");
		TreeNode node2=new TreeNode("B");
		TreeNode node3=new TreeNode("C");
		node1.add(node2);
		node2.add(node3);
		rootT.root.add(node1);
		System.err.println(">>>>>>>>>>>>>��ȡ�����ӽڵ�:"+rootT.root.getChildren());
		Enumeration<TreeNode>  Treenodes=rootT.root.getChildren();
		System.err.println(">>>>>>>>>>>>nextElement:"+Treenodes.nextElement());
		
		while (Treenodes.hasMoreElements()) {
			TreeNode treeNode = (TreeNode) Treenodes.nextElement();
			System.err.println(treeNode.getParent().getName());
			
		}

                     
	}
	

}
