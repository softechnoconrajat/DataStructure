/**
 * 
 */
/**
 * @author rajatkumar
 *
 */
package DesignPattern;

final class SingletonClass{
	
	private SingletonClass() {
		
	}
	
	static SingletonClass singletonObject = new SingletonClass();
	
	
	void addition(int a, int b) {
		
		System.out.println("Sum of the number: "  + (a + b));
		
	}
	
}