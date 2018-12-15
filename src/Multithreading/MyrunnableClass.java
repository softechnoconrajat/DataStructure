package Multithreading;

public class MyrunnableClass {
	
	//Runnable is the recommended approach because it supports inheritance.
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Myrunnable s1 = new Myrunnable();
		
		SecondJobRunnable s2 = new SecondJobRunnable();
		
		
		
		//System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(7);
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2); 
		//System.out.println(t1.getPriority());
		
		//t1.setPriority(10);
		//System.out.println(t1.getPriority());
		
		t1.start();
		//t2.start();
		
		
		
		//System.out.println(Thread.currentThread().getPriority());
		
		Myrunnable.mt = Thread.currentThread();
		t1.join();
		
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread: "+ i);
		}
		
//		Thread.currentThread().setName("Rajat");
//		System.out.println(Thread.currentThread().getName());
//		
		

	}

}
