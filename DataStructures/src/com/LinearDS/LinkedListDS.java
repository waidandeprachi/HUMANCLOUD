package com.LinearDS;

public class LinkedListDS {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		public Node(int data2, Node next2) {
			this.data = data2;
			this.next = next2;
		}
	}

	public Node head = null;
	public Node tail = null;
	public int size = 0;

	public void addLast(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	public void addFirst(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			tail = node;
			size++;
		} else {
			Node temp = head;
			head = node;
			head.next = temp;
			size++;
		}
	}

	public void addAtIndex(int data, int index) {
		if (index == 0) {
			addFirst(data);
			return;
		}
		if (index == size) {
			addLast(data);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(data, temp.next);
		temp.next = node;
		size++;
	}

	public void deleteFirst() {
		try {
		head = head.next;
		}
		catch(Exception e) {
			System.out.println("ArrayList is Empty. First add the elements.");
		}
		if (head == null) {
			tail = null;
		}
		size--;
	}

	public void deleteLast() {
		if (size <= 1) {
			deleteFirst();
		}
		Node secondlast = getIndex(size - 2);
		tail = secondlast;
		tail.next = null;
	}

	private Node getIndex(int index) {
		Node node = head;
		for (int i = 1; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public void display() {
		Node current = head;

		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}
