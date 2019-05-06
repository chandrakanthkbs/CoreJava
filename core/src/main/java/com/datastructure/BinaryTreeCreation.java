package com.datastructure;

public class BinaryTreeCreation {
	
	public static void main(String[] args) {
	
	BinaryTree theTree = new BinaryTree();
	
	theTree.addNode(50, "Boss");
	
	theTree.addNode(25, "Vice President");
	
	theTree.addNode(15, "Office Manager");

	theTree.addNode(5, "Manager");
	
	theTree.addNode(30, "Secretary");
	
	theTree.addNode(75, "Sales Manager");
	
	theTree.addNode(85, "Salesman 1");
	
	System.out.println("In order");
	
	theTree.inOrderTraverseTree(theTree.root);
	System.out.println("\nPre order");
	
	 theTree.preorderTraverseTree(theTree.root);
	System.out.println("\nPost order");
	 theTree.postOrderTraverseTree(theTree.root);
	
	// System.out.println(theTree.findNode(75));
	
	}
}


