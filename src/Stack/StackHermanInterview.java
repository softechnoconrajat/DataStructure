package Stack;

public class StackHermanInterview {
	
	int top1;
	int top2;
	
	int array[] = new int[100];
	
	public StackHermanInterview(){
		this.top1 = 0;
		this.top2 = array.length-1;	
	}
	
	//Push operation
	
	void push(int stackNo,int x) {
		
		if(stackNo == 1) {
			
			if(top1>=top2) {
				System.out.println("Stack is full");	
			}
			else {
				array[++top1] = x;		
			}	
		}
		else if(stackNo == 2) {
			if(top2<=top1) {
				System.out.println("Stack is full");
			}
			else {
				array[--top2] = x;
			}
		}
			
		}
		
	
	//POP Operation
	 int pop(int stackNo) {
		 
		 if(stackNo == 1) {
			 
			 if(top1<=0) {
				 System.out.println("Stack is empty");
				 
			 }else {
				return array[top1--]; 
			 } 
		 }
		 
		 else if(stackNo == 2) {
			 
			 if(top2>=array.length-1) {
				 System.out.println("Stack is empty");
				 
			 }else {
				 
				return array[top2++];	 
			 }
		 }
		  
		 return 0;
	}
	 
	
	 
	 public static void main(String[] args) {
		 
		 StackHermanInterview st = new StackHermanInterview();
		 
		 st.push(1, 1);
		 st.push(2, 1);
		 st.push(1, 2);
		 st.push(2, 2);
		 st.push(1, 3);
		 st.push(2, 3);
		 
		 int x = st.pop(1);
		 int y = st.pop(2);
		 System.out.println(x +" " + y);
		 
		 
	 }
	
	

}
