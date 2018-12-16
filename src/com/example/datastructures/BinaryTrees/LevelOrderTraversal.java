package com.example.datastructures.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import com.example.datastructures.BinaryTrees.InsertNode.Node;

public class LevelOrderTraversal {

public static void levelOrder(Node temp) {
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		
		while(!q.isEmpty()) {
			
			temp = q.peek();
			q.remove();
			
			System.out.println(temp.key);
			
			if(temp.lChild != null) {
				q.add(temp.lChild);
				
			}
			if(temp.rChild != null) {
				q.add(temp.rChild);
			}
			
			
		}
		
		
	}

}
