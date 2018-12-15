package Multithreading;

public class MainThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		
		
		t.start(); //its create a new thread. t.run() won't create a new thread only run method will be executed just like a normal method call by main thread.
		
//		t.setPriority(10);
		
		//t.run(1);//called on main thread.
		//t.start();
		
		
		for(int j=0;j<=10;j++) {
			System.out.println("Main Thread:" +j);
		}
		
	}
	
	//Thread Scheduler: It is the part of JVM, It is responsible to schedules threads i.e. if the multiple threads are waiting to get the chance of 
	//execution then in which order threads will be executed is decided by thread scheduler, we can't exact thread execution order the algorithm varies 
	//from jvm to jvm.
	

}
