package Stack;

public class Stack {
	
	final int max = 1000;
	int stackArray[]= new int[max];
	int top;
	
	public Stack() {
		top = -1;
	}
	
	public boolean isEmpty() {
		
		return (top<0);
	}
	
	public boolean push(int x) {
		if(top >= (max-1)) {
			System.out.println("Stack is full");
			return false;
		}
		else {
			stackArray[++top] = x;
			System.out.println("Item Pushed into stack " + x);
			return true;
		}
	}
	
	public int pop() {
		if(top<0) {
			System.out.println("The stack is Empty");
			return 0;
		}
		else {
			int x = stackArray[top--];
			System.out.println("Item Popped from stack " + x);
			return x;	
		}
	}
	
	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.pop();	
	}

}
