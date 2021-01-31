package com.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeHeight {

	Node root;
	
	public int heightfBinaryTree(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(node);
		queue.offer(null);
		int count = 1;
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			if(temp != null) {
//				if(curr_queue.left == null && curr_queue.right == null)
//					return count;
				if(temp.left != null)
					queue.offer(temp.left);
				if(temp.right != null)
					queue.offer(temp.right);
			}else {
				if(!queue.isEmpty()) {
					count++;
					queue.offer(null);
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		BinaryTreeHeight tree = new BinaryTreeHeight();
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.left.left.left = new Node(6);
		System.out.println("Height of Bianry Tree: " + tree.heightfBinaryTree(tree.root));
	}

}
