package com.BinaryTree;

public class BinaryTreeNodeSum {

	public static int getNodeSum(Node node) {
		if(node == null)
			return 0;
		int left = getNodeSum(node.left);
		int right = getNodeSum(node.right);
		return node.data + left + right;
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		System.out.println("Sum of all nodes = " + BinaryTreeNodeSum.getNodeSum(root));
	}
}
