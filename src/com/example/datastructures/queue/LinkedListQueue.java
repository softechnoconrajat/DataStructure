package com.example.datastructures.queue;

public class LinkedListQueue {
	
	static CreateQueue head;
	CreateQueue rear = null;

	
	static public class CreateQueue{
		
		int data;
		CreateQueue link;
		CreateQueue front;
	
		
		
		   public  CreateQueue(int key) {
			   this.data = key;
			   this.link = null;
			   this.front = head;
					   
		   }	
	}
	 //boolean to check if the linkedlist queue is empty.
	boolean isEmpty() {
		return (head == null);
	}
	
	//To inser the data from the rear
	public void enQueue(int item) {
	
       if(head == null) {
    	   
    	   CreateQueue newNode = new CreateQueue(item);
    	   rear = newNode;
    	   head = newNode;
    	   System.out.println("Enqueue " + item);
    	   
       }
       else {
    	  
    	   CreateQueue newNode = new CreateQueue(item);
    	   rear.link = newNode;
    	   rear = newNode;
    	   System.out.println("Enqueue " + item);
       }

}
	//To dequeue the data from front.
	public void deQueue() {
		
		if(isEmpty())
			return;
		
		
		if(head != null) {
			System.out.println("deQueue " + head.data);
			head = head.link;
		}
		
	}
	
	//To print Queue.
	
		public  void printList(CreateQueue head) {
			while(head!=null) {
				System.out.println(head.data);
				head = head.link;
	
			}
		}
	
	
	
}//End of main class.


