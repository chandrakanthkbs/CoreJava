package com.datastructure;

import java.util.*;

public class NoramalTreeNode {

	public NoramalTreeNode() {
		children = new ArrayList<NoramalTreeNode>();
	}

	public ArrayList<NoramalTreeNode> getChildren() {
		return children;
	}

	public void addChild(NoramalTreeNode n) {
		children.add(n);
	}

	public int getData() {
		return data;
	}

	public void setData(int newdata) {
		data = newdata;
	}

	private ArrayList<NoramalTreeNode> children;
	private int data;

	public void traverse(NoramalTreeNode node) { // post order traversal
		for (NoramalTreeNode each : node.getChildren()) {
			traverse(each);
		}
		System.out.println(node.data);
	}
}
