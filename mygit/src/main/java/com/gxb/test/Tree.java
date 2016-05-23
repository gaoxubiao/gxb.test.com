package com.gxb.test;

import java.util.Enumeration;

import org.apache.commons.collections.EnumerationIterator;

import antlr.collections.Enumerator;


/*
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便，看看关系图：
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
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
		System.err.println(">>>>>>>>>>>>>获取所有子节点:"+rootT.root.getChildren());
		Enumeration<TreeNode>  Treenodes=rootT.root.getChildren();
		System.err.println(">>>>>>>>>>>>nextElement:"+Treenodes.nextElement());
		
		while (Treenodes.hasMoreElements()) {
			TreeNode treeNode = (TreeNode) Treenodes.nextElement();
			System.err.println(treeNode.getParent().getName());
			
		}

                     
	}
	

}
