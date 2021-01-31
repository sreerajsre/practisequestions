package com.LinkedList;

public class DoublyLinkedList {

	public class DLLNode{
		private int data;
		public DLLNode prev;
		public DLLNode next;

		public DLLNode(int data) {
			this.data = data;
			prev = null;
			next = null;
		}

		public DLLNode(int data, DLLNode prev, DLLNode next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public DLLNode getPrev() {
			return prev;
		}

		public void setPrev(DLLNode prev) {
			this.prev = prev;
		}

		public DLLNode getNext() {
			return next;
		}

		public void setNext(DLLNode next) {
			this.next = next;
		}

	}

	private DLLNode head;
	private DLLNode tail;
	private int length;

	public DoublyLinkedList() {
		head = new DLLNode(Integer.MIN_VALUE,null,null);
		tail = new DLLNode(Integer.MIN_VALUE,head,null);
		head.setNext(tail);
		length = 0;
	}

	public void insert(int data,int position) {
		if(position < 0)
			position = 0;
		if(position > length)
			position = length;
		//if the list is empty,make it be the only element
		if(head == null) {
			head = new DLLNode(data);
			tail = head;
		}
		// if adding @ front of the list
		else if(position == 0) {
			DLLNode temp = new DLLNode(data);
			temp.next = head;
			head = temp;
		}
		// else find the correct position and insert
		else {
			DLLNode temp = head;
			for(int i=1;i<position;i++) {
				temp = temp.getNext();
			}
			DLLNode newNode = new DLLNode(data);
			newNode.next = temp.next;
			newNode.prev = temp;
			newNode.next.prev = newNode;
			temp.next = newNode;
		}
		// the list is now one value longer
		length+= 1;
	}

	public void remove(int position) {
		// fix position
		if(position < 0)
			position = 0;
		if(position >= length)
			position = length-1;
		// if nothing in the list do nothing
		if(head == null)
			return;
		// if removing the head element
		if(position == 0) {
			head = head.getNext();
			if(head == null)
				tail= null;
		}
		// else advance to the correct position and remove
		else {
			DLLNode temp = head;
			for(int i=1;i<position;i++) {
				temp = temp.getNext();
			}
			temp.getNext().setPrev(temp.getPrev());
			temp.getPrev().setNext(temp.getNext());
		}
		// the list is now one value longer
		length-= 1;
	}

	public void print(){
		DLLNode temp = head;
		System.out.print("Doubly Linked List: ");
		while(temp!=null){
			System.out.print(" " + temp.getData());
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {

	}
}
