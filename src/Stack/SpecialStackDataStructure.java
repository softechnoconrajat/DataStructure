package Stack;

public class SpecialStackDataStructure {
	//To implement a separate function getMin() to get the minimum value from the stack.(It is only the get function not like the pop())
	
	Stack st1 = new Stack();
	Stack st2 = new Stack();
	int lastValue = 0;
	
	//Push Operation.
	public void push(int x) {
		if(st1.isEmpty()) {
			st1.push(x);
			st2.push(x);
		}else {
			st1.push(x);
			if(lastValue >= x) {
				st2.push(x);
				lastValue = x;
				
			}else {
				st2.push(lastValue);		
			}
		}
	}
	
	//Pop Operation
	
	public int pop() {
		if(st1.isEmpty())
			return 0;
		st2.pop();
		return st1.pop();
		
	}
	
	//isEmpty
	public boolean isEmpty() {
		
		return st1.isEmpty();
	}
	
	
	//return Minimum value
	public int min() {
		
		return st2.pop();
		
		
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpecialStackDataStructure obje = new SpecialStackDataStructure();
		obje.push(1);
		obje.push(2);
		obje.push(3);
		
		obje.min();
		
		
		
		

	}

}
