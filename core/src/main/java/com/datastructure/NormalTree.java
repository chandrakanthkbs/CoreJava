package com.datastructure;

public class NormalTree {

	public static void main(String args[])
	{
		NoramalTreeNode root = new NoramalTreeNode();
		root.setData(10);
		
		NoramalTreeNode child1  = new NoramalTreeNode();
		child1.setData(9);
		
		NoramalTreeNode child2  = new NoramalTreeNode();
		child2.setData(8);
		
		child1.addChild(child2);
		
		root.addChild(child1);
		root.addChild(child2);
		
		
		root.traverse(root);
	}
	

}
