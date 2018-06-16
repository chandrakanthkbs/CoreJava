package com.com.datastructure;

public class BinaryTree {
	BinaryTreeNode root;

	public void addNode(int key, String name) {
		// Create a new Node and initialize it
		BinaryTreeNode newNode = new BinaryTreeNode(key, name);

		// If there is no root this becomes root
		if (root == null) {
			root = newNode;
		} else {

			// Set root as the Node we will start with as we traverse the tree
			BinaryTreeNode focusNode = root;

			// Future parent for our new Node
			BinaryTreeNode parent;
			
			while (true) {

				// root is the top parent so we start there
				parent = focusNode;

				// Check if the new node should go on the left side of the parent node
				if (key < focusNode.key) {

					// Switch focus to the left child
					focusNode = focusNode.leftChild;

					// If the left child has no children
					if (focusNode == null) {

						// then place the new node on the left of it
						parent.leftChild = newNode;
						return; // All Done
					}
				} else { // If we get here put the node on the right
					focusNode = focusNode.rightChild;

					// If the right child has no children
					if (focusNode == null) {

						// then place the new node on the right of it
						parent.rightChild = newNode;
						return; // All Done
					}
				}
			}
		}
	}

	// All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth

	public void inOrderTraverseTree(BinaryTreeNode focusNode) {

		if (focusNode != null) {

			// Traverse the left node
			inOrderTraverseTree(focusNode.leftChild);

			// Visit the currently focused on node
			System.out.println(focusNode);

			// Traverse the right node
			inOrderTraverseTree(focusNode.rightChild);
		}
	}

	public void preorderTraverseTree(BinaryTreeNode focusNode) {

		if (focusNode != null) {
			System.out.println(focusNode);
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);
		}
	}

	public void postOrderTraverseTree(BinaryTreeNode focusNode) {

		if (focusNode != null) {
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
	
	public BinaryTreeNode findNode(int key) {

		// Start at the top of the tree
		BinaryTreeNode focusNode = root;

		// While we haven't found the Node keep looking
		while (focusNode.key != key) {

			// If we should search to the left
			if (key < focusNode.key) {

				// Shift the focus Node to the left child
				focusNode = focusNode.leftChild;

			} else {
				// Shift the focus Node to the right child
				focusNode = focusNode.rightChild;
			}

			// The node wasn't found
			if (focusNode == null)
				return null;
		}
		return focusNode;
	}
}