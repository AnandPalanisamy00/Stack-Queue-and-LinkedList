package com.queue;

class Node {
	int value;
	Node next;
}

class Queue {
	private Node head;
	final static int UNDEFINED = -11111; // for returning a dummy value when over dequeue happen
	
	public  Queue() {
		head = null;
	}
	
	public void enqueue(int val) {
		if(head == null) {
			head = new Node();
			head.value = val;
			head.next = null;
		}
		else {
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new Node();
			temp.next.value = val;
			temp.next.next =  null;
		}
	}
	
	public int dequeue() {
		if(head != null) {
			int val = head.value;
			head = head.next;
			return val;
		}
		else
			return Queue.UNDEFINED;
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
	}
	
	public int top() {
		if(! this.isEmpty())
			return head.value;
		else
			return Queue.UNDEFINED;
	}

	public void fnInsert(int element) {
		// TODO Auto-generated method stub
		
	}

	public void fnDelete() {
		// TODO Auto-generated method stub
		
	}

	public void fnDisplay() {
		// TODO Auto-generated method stub
		
	}
	
	
}
