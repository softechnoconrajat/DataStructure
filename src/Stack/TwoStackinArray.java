package Stack;

public class TwoStackinArray {
	
	int top1;
	int top2;
	
	int array[] = new int[100];
	
	public TwoStackinArray(){
		
		this.top1 = 0;
		this.top2 = array.length-1;
		
	}
	
	//Push operation
	
	void push1(int x) {
		
		if(top1>=top2) {
			System.out.println("Stack is full");	
		}
		else {
			
			array[++top1] = x;
				
		}	
	}
	
	
	void push2(int x) {
		

		if(top2<=top1) {
			System.out.println("Stack is full");
		}
		else {
			array[--top2] = x;
		}	
	}
	
	
	//POP Operation
	 int pop1() {
		 
		 if(top1<=0) {
			 System.out.println("Stack is empty");
			 
		 }else {
			return array[top1--]; 
		 }
		 
		 return 0;
		
	}
	 
	
	 int pop2() {
		 
		 if(top2>=array.length-1) {
			 System.out.println("Stack is empty");
			 
		 }else {
			 
			return array[top2++];
			 
		 }
		 
		 return 0;
		
	}
	
	

}
