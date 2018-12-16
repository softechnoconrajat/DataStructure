package ExceptionHandling;



public class ExceptionHandling {
	
	public static void main(String[] args)  {
		
		int i = 0;
		
		try {
			
			System.out.println(10/i);
			
		}
		catch(ArithmeticException e) {
			
		//	Ways to print the exception Method 1. printStackTrace(), 2. e.toString(), 3. e.getMessage().
			
			//e.printStackTrace();
			
		System.out.println(e.toString());
			
			//System.out.println(e.getMessage());	
		
		}
	}

}
