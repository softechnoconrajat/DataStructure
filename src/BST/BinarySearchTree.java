package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	
	static class Node{
		int key;
		Node lChild, rChild;
		
		Node(int key){
			this.key = key;
			lChild = null;
			rChild = null;
		}
	}
	
	static Node head;
	Node temp = head;
	
	public static void inorder(Node temp) {
		
		if(temp==null)
			return;
		
		inorder(temp.lChild);
		System.out.println(temp.key);
		inorder(temp.rChild);
	}
	
	public static void insertBST(Node temp, int key) {
		
		Queue<Node> q = new LinkedList<>();
		q.add(temp);
		
		
			 
				while(!q.isEmpty()){
					temp = q.peek();
					q.remove();
					if(temp.key < key) {
						if(temp.rChild != null) {
							temp = temp.rChild;
							q.add(temp);
						}
						else {
							temp.rChild = new Node(key);
						}
					}
					else if(temp.key > key) {
						
						if(temp.lChild != null) {
							temp = temp.lChild;
							q.add(temp);
						}
						else {
							temp.lChild = new Node(key);
						}	
					}				
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.head = new Node(10);
		BinarySearchTree.insertBST(head, 20);
		BinarySearchTree.insertBST(head, 19);
		BinarySearchTree.insertBST(head, 40);
		BinarySearchTree.insertBST(head, 50);
		BinarySearchTree.insertBST(head, 60);
		BinarySearchTree.insertBST(head, 5);
		BinarySearchTree.insertBST(head, 2);
		BinarySearchTree.insertBST(head, 6);
		inorder(head);
		

	}

}
