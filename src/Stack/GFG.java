package Stack;

import java.util.LinkedList;
import java.util.Queue;

class GFG{

	static class StackImplementationUsingQueue {
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		
		public StackImplementationUsingQueue() {
			
		}
		
		public void push(int x) {
			
				q2.add(x);
			
			while(!q1.isEmpty()) {
				q2.add(q1.peek());
				q1.remove();
			}
			
			Queue<Integer> q = q1;
			q1= q2;
			q2 = q;
			
		}
		
			public int pop() {
				
				return q1.remove();
				
			}			
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CallerStack.stackImplementationUsingQueue();
		
		StackImplementationUsingQueue st = new StackImplementationUsingQueue();
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st.pop());
		

	}
	
	
	
	
}


