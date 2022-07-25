package balancing;

import java.util.Scanner;

public class StringBalancing {
	
	public boolean isBalance(String value) {
		
		MinStack minstack = new MinStack();
		 for(int i=0; i< value.length();i++)
		 {
			 if(value.charAt(i) == '(' || value.charAt(i)=='{' || value.charAt(i)=='[')
			 {
				 minstack.push(value.charAt(i));
			 }
			 else if(!minstack.isEmpty() && ((value.charAt(i) == ']' && minstack.top()== '[') ||
						(value.charAt(i) == '}' && minstack.top()== '{') || (value.charAt(i) == ')' && minstack.top()== '(')))
			{
				 minstack.pop();
			}
			 else
			 {
				minstack.push(value.charAt(i));
			 }
		 }
		 if(minstack.isEmpty())
		 {
			 return true;
		 }
		 else
			 return false;
	}
	
	public static void main(String[] args) {
	 
		StringBalancing bal = new StringBalancing();
	     boolean result = bal.isBalance("{}()");
	
	    if(result == true)
	    	System.out.println("true");
	    else
	    	System.out.println("false");	
}
}
