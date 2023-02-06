package com.LinearDS;

import java.util.Scanner;

public class ImplemenationDS {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("**************************************************");
			System.out.println("===================MAIN MENU======================");
			System.out.println(" 1. ArrayList");
			System.out.println(" 2. LinkedList");
			System.out.println(" 3. Stack");
			System.out.println(" 4. Queue");
			System.out.println(" 5. Exit");
			System.out.println("**************************************************");
			System.out.println("Choose any datastructure: ");
			int ch;
			switch (ch = sc.nextInt()) {
			case 1:
				ArrayDS<Integer> array = new ArrayDS();
				int n;
				do {
					System.out.println(
							"1. Insert \n2. Insert at particular index \n3. Delete \n4. Length  \n5. Display Araylist");
					switch (n = sc.nextInt()) {
					case 1:
						System.out.println("Enter the number of elements you want to enter:");
						int len = sc.nextInt();
						for (int i = 0; i < len; i++) {
							array.add(sc.nextInt());
						}
						break;
					case 2:
						System.out.println("Enter the index at which you want to insert data:");
						array.setAtIndex(sc.nextInt(), sc.nextInt());
						break;
					case 3:
						System.out.println(array.remove()+ " Deleted successfully");
						break;
					case 4:
						System.out.println(array.getSize()); 
						break;
					case 5:
						System.out.println(array.toString());
						break;
					default:
						System.out.println("Enter valid choice");

					}
					System.out.println("Enter 'Y' to Continue and 'N' to Exit");
					
				} while (sc.next().equalsIgnoreCase("Y"));

				break;
			case 2:
				LinkedListDS list = new LinkedListDS();
				do {
					System.out.println(
							"1. Insert at First \n2.Insert at particular index \n3. Insert at last \n4. Delete First element \n5. Delete Last element \n6. Display List");
					switch (n = sc.nextInt()) {
					case 1:
						System.out.println("Enter the number of elements you want to enter:");
						int len = sc.nextInt();
						for (int i = 0; i < len; i++) {
							list.addFirst(sc.nextInt());
						}
						break;
					case 2:
						System.out.println("Enter the data and index at which you want to insert data ");
						list.addAtIndex(sc.nextInt(), sc.nextInt());
						break;
					case 3:
						System.out.println("Enter the number of elements you want to enter:");
						int n1 = sc.nextInt();
						for (int i = 0; i < n1; i++) {
							list.addLast(sc.nextInt());
						}
						break;
					case 4:
						list.deleteFirst();
						System.out.println("Deleted successfully");
						break;
					case 5:
						list.deleteLast();
						System.out.println("Deleted successfully");
						break;
					case 6:
						list.display();
						break;
					default:
						System.out.println("Enter valid choice");

					}
					System.out.println("Enter 'Y' to Continue and 'N' to Exit");

				} while (sc.next().equalsIgnoreCase("Y"));
				break;
			case 3:
				StackDS stack = new StackDS(5);
				do {
					System.out.println("1. Push \n2. Pop \n3. Peek \n4.Display");
					switch (n = sc.nextInt()) {
					case 1:
						System.out.println("Enter the number of elements you want to push: ");
						int len1 = sc.nextInt();
						for (int i = 0; i < len1; i++) {
							stack.push(sc.nextInt());
						}
						break;
					case 2:
						int num = stack.pop();
						System.out.println(num + " Poped successfully");
						break;
					case 3:
						System.out.println(stack.peek() + " Peeked successfully");
						break;
					case 4:
						stack.printStack();
						break;
					}
					System.out.println("Enter 'Y' to Continue and 'N' to Exit");

				} while (sc.next().equalsIgnoreCase("Y"));
				
				break;
			case 4:
				QueueDS queue = new QueueDS();
				do {
					System.out.println("1. Enqueue \n2. Dequeue \n3. Front \n4. Display");
					switch (n = sc.nextInt()) {
					case 1:
						System.out.println("Enter the number of elements you want to enqueue : ");
						int len1 = sc.nextInt();
						for (int i = 0; i < len1; i++) {
							queue.enqueue(sc.nextInt());
						}
						break;
					case 2:
						queue.dequeue();
						break;
					case 3:
						System.out.println(queue.front());
						break;
					case 4:
						queue.display();
						break;
					}
					System.out.println("Enter 'Y' to Continue and 'N' to Exit");

				} while (sc.next().equalsIgnoreCase("Y"));
				break;
			case 5:
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice Enter again");
				
			}
		}
	}
}
