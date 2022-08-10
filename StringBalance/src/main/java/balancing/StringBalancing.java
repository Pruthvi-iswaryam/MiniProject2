package balancing;


import java.util.Scanner;

public class StringBalancing {
	
	public boolean isBalance(String value) {
		
		MinStackImpl minstack = new MinStackImpl();
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

}