package com.LinearDS;

public class StackDS {

	private int arr[];
	private int top;
	private int capacity;

	StackDS(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack is full cannot insert any element");
			System.exit(1);
		} else {
			arr[++top] = data;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		}
		return arr[top--];
	}

	public int peek() {
		try {
		return  arr[top];
		}
		catch(Exception e) {
			System.out.println("Stack is Empty");
		}
		return 0;
	}

	public int getSize() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
