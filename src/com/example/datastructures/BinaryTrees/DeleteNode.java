package com.example.datastructures.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import com.example.datastructures.BinaryTrees.InsertNode.Node;

public class DeleteNode {
	
	static Node lastNode;
		
		private static Node lastNode(Node temp) {
			
			Queue<Node> q = new LinkedList<Node>();
			q.add(temp);
			
			while(!q.isEmpty()) {
				
				temp = q.peek();
				q.remove();
				
				if(temp.lChild != null) {
					q.add(temp.lChild);
					
				}
				if(temp.rChild != null) {
					q.add(temp.rChild);
				}
				
				lastNode = temp;
			}
			return lastNode;
		}
		
		
		//Node to delete
		private static Node nodeTodelete(Node temp, int del) {
			
			
			Queue<Node> q = new LinkedList<Node>();
			q.add(temp);
			
			while(!q.isEmpty()) {
				
				temp = q.peek();
				q.remove();
				
				if(temp.key == del ) {
					return temp;
				}
				
				if(temp.lChild != null) {
					q.add(temp.lChild);
					
				}
				if(temp.rChild != null) {
					q.add(temp.rChild);
				}
			}
			
			return null;
			
			
		}
		
		public static void delete(Node temp, int del) {
			
			Node lastNode = DeleteNode.lastNode(temp); 
			Node keyNodeDelete = DeleteNode.nodeTodelete(temp, del);
			
//			System.out.println("Last" +lastNode.key);
//			System.out.println("Key" + keyNodeDelete.key);
			
			
			if(keyNodeDelete==null) {
				System.out.println("Node not found");
			}
			else {
//				System.out.println("Reaching");
				DeleteNode.swapNode(lastNode, keyNodeDelete);
				
			}
			
				
			
			
		}
		
		private static void swapNode(Node n1, Node n2) {	
			if(n1 == n2) {
				n1 = null;
				
			}else {
				
				n2.key=n1.key;
				//Delink the n1 here. 
				//Use inorder to do the traversal.
				
			}
			
		}
		
		
		

}
