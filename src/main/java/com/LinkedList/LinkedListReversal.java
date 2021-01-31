package com.LinkedList;

public class LinkedListReversal {

	Node head; // head of list 

	/* Linked list Node*/
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) {data = d; next = null; } 
	} 

	private Node reversePairIterative(Node head) {
		// TODO Auto-generated method stub
		Node temp1 = null;
		Node temp2 = null;
		while(head !=null && head.next != null) {
			if(temp1 != null) {
				temp1.next.next = head.next;
			}
			temp1 = head.next;
			head.next = head.next.next;
			temp1.next = head;
			if(temp2 == null)
				temp2 = temp1;
			head = head.next;
		}
		return temp2;
	} 
	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) 
	{ 
		/* 1 & 2: Allocate the Node & 
					Put in the data*/
		Node new_node = new Node(new_data); 

		/* 3. Make next of new Node as head */
		new_node.next = head; 

		/* 4. Move the head to point to new Node */
		head = new_node; 
	} 

	/* Function to print linked list */
	void printList() 
	{ 
		Node temp = head; 
		while (temp != null) 
		{ 
			System.out.print(temp.data+" "); 
			temp = temp.next; 
		} 
		System.out.println(); 
	} 

	/* Drier program to test above functions */
	public static void main(String args[]) 
	{ 
		LinkedListReversal llist = new LinkedListReversal(); 

		/* Constructed Linked List is 1->2->3->4->5->6-> 
			7->8->8->9->null */
		//		llist.push(9); 
		//		llist.push(8); 
		//		llist.push(7); 
		//		llist.push(6); 
		//		llist.push(5); 
		llist.push(4); 
		llist.push(3); 
		llist.push(2); 
		llist.push(1); 

		System.out.println("Given Linked List"); 
		llist.printList(); 

		llist.head = llist.reversePairIterative(llist.head);

		System.out.println("Reversed list"); 
		llist.printList(); 
	}

}
