package com.example.datastructures.BinaryTrees;

import java.util.TreeSet;

public class BinaryTree {

	Node root;
	
	BinaryTree(int key){
		root = new Node(key);
	}
	
	BinaryTree(){
		root = null;
	}
	
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		TreeSet tr = new TreeSet();
		
		tree.root = new Node(1);
		
		tree.root.leftNode = new Node(2);
		tree.root.rightNode = new Node(3);
		
	}
	
	
}
