package com.BinaryTree;

public class BSTTraversal {
	Node root;
	public BSTTraversal() {
		root = null;
	}
	
	void insert(int key) {
		root = insertRec(root,key);
	}

	private Node insertRec(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key < root.data) {
			root.left = insertRec(root.left,key);
		} else if(key > root.data) {
			root.right = insertRec(root.right,key);
		}
		return root;
	}
	
	public void inorder() {
		inordeRec(root);
		System.out.println();
	}
	public void preorder() {
		preordeRec(root);
		System.out.println();
	}

	public void postorder() {
		postordeRec(root);
		System.out.println();
	}
	
	public void delete(int key) {
		root = deleteRec(root,key);
	}

	private Node deleteRec(Node root, int key) {
		if(root == null) return root;
		if(key < root.data) root.left = deleteRec(root.left, key);
		else if(key > root.data) root.right  = deleteRec(root.right, key);
		else {
			if(root.left == null) return root.right;
			else if(root.right == null) return root.left;
			root.data = minValue(root.right);
			root.right = deleteRec(root.right, root.data);
		}
		return root;	
	}

	private int minValue(Node root) {
		int minVal = root.data;
		while(root.left != null) {
			minVal = root.left.data;
			root = root.left;
		}
		return minVal;
	}

	private void inordeRec(Node root) {
		if(root!= null) {
			inordeRec(root.left);
			System.out.print(root.data + ", ");
			inordeRec(root.right);
		}
	}
	
	private void preordeRec(Node root) {
		if(root!= null) {
			System.out.print(root.data + ", ");
			preordeRec(root.left);
			preordeRec(root.right);
		}
	}
	
	private void postordeRec(Node root) {
		if(root!= null) {
			postordeRec(root.left);
			postordeRec(root.right);
			System.out.print(root.data + ", ");
		}
	}

	public static void main(String[] args) {
		BSTTraversal tree = new BSTTraversal();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80);
        System.out.println("In order");
        tree.inorder();
        System.out.println("-----------------------------------------------------------");
        System.out.println("In pre-order");
        tree.preorder();
        System.out.println("-----------------------------------------------------------");
        System.out.println("In post-order");
        tree.postorder();
        System.out.println("-----------------------------------------------------------");
        System.out.println("***********************************************************");
//        System.out.println("Deleting the leaf : 20");
//        tree.delete(20);
//        System.out.println("In order");
//        tree.inorder();
//        System.out.println("***********************************************************");
//        System.out.println("Deleting the right child of 30");
//        tree.delete(30);
//        System.out.println("In order");
//        tree.inorder();
//        System.out.println("***********************************************************");
//        System.out.println("Deleting the node having 2 children[50]");
//        tree.delete(50);
//        System.out.println("In order");
//        tree.inorder();
//        System.out.println("***********************************************************");
	}

}
