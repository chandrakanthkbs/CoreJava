package com.com.datastructure;

class BinaryTreeNode {

	int key;
	String name;

	BinaryTreeNode leftChild;
	BinaryTreeNode rightChild;
	BinaryTreeNode children;

	public BinaryTreeNode getChildren() {
		return children;
	}

	public void setChildren(BinaryTreeNode children) {
		this.children = children;
	}

	BinaryTreeNode(int key, String name) {

		this.key = key;
		this.name = name;
	}

	public String toString() {
		return name + " has the key " + key;

	}
}
