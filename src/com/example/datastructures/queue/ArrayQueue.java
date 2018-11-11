package com.example.datastructures.queue;

import java.lang.reflect.Array;

public class ArrayQueue {
	
	int front;
	int rear;
	int size;
	int capacity;
	int array[];
	
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity-1;
		array = new int[this.capacity];
	}
	
	//Queue will become full when the size of the queue will 
	//become equal to the capacity.
	
	boolean isFull(ArrayQueue queue) {
		
		return (queue.size == queue.capacity);
		
	}
	
	//Queue is Empty or not
	boolean isEmpty(ArrayQueue queue) {
		
		return (queue.size == 0);
		
	}
	
	//Enqueue function
	
	 void enQueue(int item) {
		
		if (isFull(this)) {
			return;
		}	
		this.rear = (this.rear + 1)% this.capacity;
		this.array[this.rear] = item;
		this.size++;
		System.out.println(item+ "Enqueue to Queue");		
		}
		
	
	//Dequeue Function
	 
	 int deQueue() {
		 if(isEmpty(this)) 
			return Integer.MIN_VALUE;
		 int item = this.array[this.front];
		 this.front = (this.front +1 )% this.capacity;
		 this.size = this.size - 1;
		 return item; 
	 }
	 
	 //Method to get front of queue
	 int front() {
		 if(isEmpty(this))
			 return Integer.MIN_VALUE;
		 
		 return this.array[this.front];
	 }
	 
	 //Method to get rear of queue
	 
	 int rear() {
		 if(isEmpty(this))
			 return Integer.MIN_VALUE;
		 return this.array[this.rear];
	 }
	 
	
}
