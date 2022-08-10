package balancing;

public class StringBalancingImpl implements IStringBalancing {
	
public IMinStack IMinStackService;
	

  public StringBalancingImpl(IMinStack IMinStackService)
  {
	  this.IMinStackService=IMinStackService; 
  }
 
	public StringBalancingImpl() {
	
		
	}

	public boolean isBalance(String value) 
	{
		
		 for(int i=0; i< value.length();i++)
		 {
			 if(value.charAt(i) == '(' || value.charAt(i)=='{' || value.charAt(i)=='[')
			 {
				 IMinStackService.push(value.charAt(i));
				 IMinStackService.push(value.charAt(i));
			 }
			 else if(!IMinStackService.isEmpty() && ((value.charAt(i) == ']' && IMinStackService.top()== '[') ||
						(value.charAt(i) == '}' && IMinStackService.top()== '{') || (value.charAt(i) == ')'
						&& IMinStackService.top()== '(')))
			{
				 IMinStackService.pop();
			}
			 else
			 {
				 IMinStackService.push(value.charAt(i));
			 }
		 }
		 if(IMinStackService.isEmpty())
		 {
			 return true;
		 }
		 else
			 return false;
	}	
}
