package Stack;

import Stack.GFG.StackImplementationUsingQueue;

public class CallerStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CallerStack.stackImplementationUsingQueue();
		

	}
	
	
	public static void twoStackinArray() {
		//TwoStackinArray
		TwoStackinArray st = new TwoStackinArray();
		
		st.pop1();
		st.push1(2);
		st.push2(3);
		st.push1(4);
		st.push2(5);
		int x = st.pop1();
		System.out.println(x);
		
		
	}
	
	//StackImplementationUsingQueue
	

	

}
