package Multithreading;

public class Myrunnable implements Runnable {
	
	static Thread mt;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			mt.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i = 1; i<=10;i++) {
			System.out.println("Child Thread:" + i);
			//Thread.currentThread().yield();
			//Some platforms won't provide proper support for yileds methods.
			//public static native void yield()
			//Thread.yield(); //This will return the status of the thread to  ready/runnable.
			
			
		}
		//System.out.println(Thread.currentThread().getName());
	}
}
