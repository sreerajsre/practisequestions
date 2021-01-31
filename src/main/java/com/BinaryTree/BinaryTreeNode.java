package com.BinaryTree;

class SimpleBinaryTreeNode {
	public int data;
	public SimpleBinaryTreeNode left,right;
	public SimpleBinaryTreeNode(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SimpleBinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(SimpleBinaryTreeNode left) {
		this.left = left;
	}
	public SimpleBinaryTreeNode getRight() {
		return right;
	}
	public void setRight(SimpleBinaryTreeNode right) {
		this.right = right;
	}
}	
class BinaryTreeNode{
	SimpleBinaryTreeNode root;
	public int maxBinaryTree(SimpleBinaryTreeNode root) {
		int max = Integer.MIN_VALUE;
		if(root != null) {
			int left = maxBinaryTree(root.left);
			int right = maxBinaryTree(root.right);
			if(left > right)
				max = left;
			else
				max = right;
			if(root.data > max)
				max = root.data;
		}
		return max;
	}

	public int maxDepth(SimpleBinaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		if(left> right) {
			return left+1;
		}else
			return right+1;
	}
	
	public SimpleBinaryTreeNode mirror(SimpleBinaryTreeNode root) {
		SimpleBinaryTreeNode temp;
		if(root != null) {
			mirror(root.left);
			mirror(root.right);
			temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		return root;
	}

	

	public static void main(String args[]) {
		BinaryTreeNode treeNode = new BinaryTreeNode();
		treeNode.root = new SimpleBinaryTreeNode(1);
		treeNode.root.left = new SimpleBinaryTreeNode(2);
		treeNode.root.right = new SimpleBinaryTreeNode(3);
		treeNode.root.left.left = new SimpleBinaryTreeNode(4);
		treeNode.root.left.right = new SimpleBinaryTreeNode(5);
		treeNode.root.right.left = new SimpleBinaryTreeNode(6);
		treeNode.root.right.right = new SimpleBinaryTreeNode(7);
		//System.out.println(treeNode.maxBinaryTree(treeNode.root));
		//System.out.println(treeNode.maxDepth(treeNode.root));
		treeNode.mirror(treeNode.root);
	}
}

