package com.gxb.test;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {
	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children=new Vector<TreeNode>();
	
	public TreeNode(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TreeNode getParent() {
		return parent;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
  /*
   * 
   * ����ӽڵ�
   * */
   public void add(TreeNode node){
	   children.add(node);
	   
   }
   /*
    * ɾ���ӽڵ�
    * */
   public void delete(TreeNode node){
	   children.remove(node);
   }
   /*
    * ��ȡ�ڵ�
    * */
	public Enumeration<TreeNode> getChildren(){
		return children.elements();
	}
	
	
	

}
