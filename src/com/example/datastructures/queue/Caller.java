package com.example.datastructures.queue;

import java.util.LinkedList;

import com.example.datastructures.queue.LinkedListQueue.CreateQueue;

public class Caller {
	
	public static void main(String[] args) {
		
		//Caller.arrayQueue();
		
		Caller.linkedListQueue();
		
	}
	
	
	
public static void arrayQueue() {
		
ArrayQueue queue = new ArrayQueue(1000);
		
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		
		System.out.println( queue.size);
		
	}


public static void linkedListQueue() {
	
//	LinkedListQueue llQ = new LinkedListQueue();
//	llQ.head = new CreateList(1);
//	CreateList secondItem = new CreateList(2);
//	CreateList thirdItem = new CreateList(3);
//	CreateList fourthItem = new CreateList(4);
//	CreateList fifthItem = new CreateList(5);
//	
//	llQ.head.link = secondItem;
//	secondItem.link = thirdItem;
//	thirdItem.link = fourthItem;
//	fourthItem.link = fifthItem;
//	fifthItem.link = null;
//	
//	llQ.printList(llQ.head);
	
//	LinkedListQueue llQ = new LinkedListQueue();

//	LinkedListQueue llQ = new LinkedListQueue();
//	
//	llQ.enQueue(1);
//	llQ.enQueue(2);
//	llQ.enQueue(3);
//	llQ.enQueue(4);
//	llQ.enQueue(5);
//	llQ.enQueue(6);
//
////	
//	llQ.deQueue();
//	llQ.deQueue();
//	llQ.deQueue();
//	llQ.deQueue();
//	llQ.deQueue();
//	
//	
//	
//	
//	llQ.printList(llQ.head);
	
	LinkedListQueue q=new LinkedListQueue(); 
     q.enQueue(10); 
     q.enQueue(20); 
     q.deQueue(); 
     q.deQueue(); 
     q.enQueue(30); 
     q.enQueue(40); 
     q.enQueue(50); 
     q.deQueue();
       
    // System.out.println("Dequeued item is "+ q.deQueue()); 
	
	
	
	
	
}
	





}
