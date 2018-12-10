package Stack;

public class QueueImplementationStackMethod2 {
	
	//Method2 Implementing using the deQueue operation costly. (Best Method)
	
	Stack st1 = new Stack();
	Stack st2 = new Stack();
	
	public void enQueue(int x) {
		st1.push(x);	
	}
	
	public int deQueue() {
		
		if(st1.isEmpty() && st2.isEmpty()) {
			System.out.println("Printing");
			return 0;
		}
		else if(st2.isEmpty()) {
			while(!st1.isEmpty()) {
				st2.push(st1.pop());
			}
			return st2.pop();	
		}
		else {
			st2.pop();
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplementationStackMethod2 obj = new QueueImplementationStackMethod2();
		
		obj.enQueue(1);
		obj.enQueue(2);
		obj.enQueue(3);
		obj.enQueue(4);
		obj.deQueue();
		obj.deQueue();
		obj.deQueue();
		obj.enQueue(13);
		obj.deQueue();
		obj.deQueue();
	}

}
