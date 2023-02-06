package com.LinearDS;

public class QueueDS {
	private int size = 5;
	private int items[] = new int[size];
	private int front, rear;

	QueueDS() {
		front = -1;
		rear = -1;
	}

	public void enqueue(int data) {
		
			if (front == -1) {
				front = 0;
			}
			try {
			items[++rear] = data;
			System.out.println("Inserted :" + data);
			}
			catch(Exception e) {
				System.out.println("Queue is Full");
			}
		
	}

	public void dequeue() {
		int ele;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			
		} else {
			ele = items[front];
			if (front >= rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
			System.out.println("Deleted : " + ele);
		}
	}

	public boolean isFull() {
		if (front == 0 && rear == size - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		}
		return false;
	}

	public int front() {
		if (isEmpty()) {
			return 0;
		}
		return items[front];
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			for (int i = front; i <= rear; i++) {
				System.out.print(items[i] + " ");
			}
			System.out.println();
		}
	}
}
