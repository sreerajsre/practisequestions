package com.BinaryTree;

public class MinimumDepth {

	Node root;
	
	public static int getMinimumDepth(Node node) {
		int left;
		int right;
		if(node == null)
			return 0;
		if(node.left == null && node.right ==null)
			return 1;
		left = (node.left !=null)?getMinimumDepth(node.left) : Integer.MAX_VALUE;
		right =(node.right !=null)?getMinimumDepth(node.right): Integer.MAX_VALUE;
		return Math.min(left,right) + 1;
	}
	public static void main(String[] args) {
	/*	 1
		   / \
		  2   3
		 / \ / \
		4  5 6  7
		 \  \    \
		  8  9    10
		 /
		11 
	*/	
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.right = new Node(8);
		root.left.left.right.left = new Node(11);
		root.left.right.right = new Node(9);
		root.right.right.right = new Node(10);
		System.out.println("Minimum depth is : " + MinimumDepth.getMinimumDepth(root) );

	}

}
