package Stack;

import java.util.List;
import java.util.Stack;

public class CompilerCricBuzzInterview {
	
	public static boolean patternMatching(String input) {
		
		Stack st = new Stack();
			
		for(int i=0;i<input.length();i++) {
			
			if(input.charAt(i)== '{' || input.charAt(i)== '(' || input.charAt(i)== '[' ) {
				st.push(input.charAt(i));
				System.out.println(input.charAt(i));
						
			}
			else if(input.charAt(i)== '}' &&  st.peek().equals('{') || input.charAt(i)== ')' &&  st.peek().equals(')') || input.charAt(i)== ']' &&  st.peek().equals('{') ) {
				st.pop();
					
			}
			else {
				return false;
			}
					
			}
			
		if(st.isEmpty())
			return true;
	
		return false;
	}
	
	public static void main(String[] args) {
		
		String input = "{}";
		
		boolean x = CompilerCricBuzzInterview.patternMatching(input);
		System.out.println(x);
		
	}

}
