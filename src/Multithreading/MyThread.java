package Multithreading;

public class MyThread extends Thread {
	
	//Thread class has emplty run-method.
	//Highly recommended to override run method otherwise don't go for multithreding. 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.println("Child Thread: " + i);
		}
		
	
		
		
		
	}
	//overloading the run methods.
	public void run(int number) {
		
		for(int i=0;i<=10;i++) {
			System.out.println("Overloading: " + i);
		}
		
		
	}
	

}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 */ 
