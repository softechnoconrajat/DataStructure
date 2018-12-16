package com.example.datastructures.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class InsertNode {
	
	static class Node{
		int key;
		Node lChild, rChild;
		
		Node(int key){
			this.key = key;
			lChild = null;
			rChild = null;
		}
	}//End of Node Class
	
	static Node root;
	Node temp = root;
	
	//To print the tree
	
	static void inorder(Node temp) {
		if(temp == null)
			return;
		
		inorder(temp.lChild);
		System.out.println(temp.key + " ");
		inorder(temp.rChild);
		
	}
	
	static void insert(Node temp, int key) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		
		while(!q.isEmpty()) {
			
			temp = q.peek();
			q.remove();
			
			if(temp.lChild==null) {
				temp.lChild = new Node(key);
				return;
			}
			else {
				q.add(temp.lChild);
				
			}
			if(temp.rChild== null) {
				temp.rChild = new Node(key);
				return;
			}
			else {
				q.add(temp.rChild);
			}
		}
		
	}
	
	
	public static void main(String args[]) {
		
		root = new Node(10);
		root.lChild = new Node(20);
		root.rChild = new Node(30);
		insert(root, 40);
		insert(root, 50);
		insert(root, 60);
		insert(root, 70);
		
		LevelOrderTraversal.levelOrder(root);
		
		DeleteNode.delete(root, 20);
		
		LevelOrderTraversal.levelOrder(root);
	
		//inorder(root);
		
	}

}
