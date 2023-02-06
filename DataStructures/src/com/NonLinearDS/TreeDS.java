package com.NonLinearDS;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}

public class TreeDS {
	
	Node root;
	
	public void inOrder(Node root) {
		if(root == null) {
			return ;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public void preOrder(Node root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void postOrder(Node root) {
		if(root == null) {
			return ;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	
}
