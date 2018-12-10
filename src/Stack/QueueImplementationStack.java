package Stack;

public class QueueImplementationStack {
	
	//Method 1 by using enQueue operation costly.
	Stack st1 = new Stack();
	Stack st2 = new Stack();
	int x,y ;
	
	public void enQueue(int num) {
		if(st1.isEmpty()) {
			st1.push(num);
		}
			else {
				
				while(!st1.isEmpty()) {
					x= st1.pop();
					st2.push(x);
				}
				
				st1.push(num);
				while(!st2.isEmpty()) {
					y= st2.pop();
					st1.push(x);
				}	
			}	
	}
	
	public int deQueue() {
		
		if(st1.isEmpty())
			return 0;
		
		return st1.pop();	
	}
	
	
	public static void main (String[] args) {
		
//		Stack st1 = new Stack();
//		Stack st2 = new Stack();
//		
		QueueImplementationStack objStack = new QueueImplementationStack();
		objStack.enQueue(2);
		objStack.enQueue(3);
		objStack.deQueue();
		objStack.deQueue();
		objStack.enQueue(2);
		
		
	}
	

}
