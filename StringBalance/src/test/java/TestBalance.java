import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


import org.junit.Test;

import balancing.IMinStack;
import balancing.IStringBalancing;
import balancing.MinStackImpl;
import balancing.StringBalancing;
import balancing.StringBalancingImpl;

public class TestBalance {
	
	StringBalancing balance = new StringBalancing();

	IMinStack minstack;
	StringBalancingImpl Balance;
	
	@Test
	public void When_StringHasDiffSetOfOpenAndCloseBrackets_Expect_false()
	{
		IStringBalancing StringBalancingService = spy(IStringBalancing.class);
		
		String input = "()}";
		
		assertEquals(false,balance.isBalance(input));
	}
	

	@Test
	public void When_StringHasSameSetOfOpenAndCloseBrackets_Expect_true()
	{
		IStringBalancing StringBalancingService = spy(IStringBalancing.class);
		
		String input = "()";
				
		assertEquals(true,balance.isBalance(input));
	}
	
	@Test
	public void When_StringhasSameSetOfOpenAndCloseBrackets_Expect_true()
	{
		    MinStackImpl stack = new MinStackImpl();
		    IMinStack minStackInterface = new MinStackImpl(stack); 
			Balance = new StringBalancingImpl(minStackInterface);
			String input = "{}";
			assertEquals(true,balance.isBalance(input));
	}
	
	@Test
	public void When_StringHasDifferentSetOfOpenAndCloseBrackets_Expect_false()
	{
		IStringBalancing StringBalancingService = spy(IStringBalancing.class);
		
		String input = "()}{";
		
		
		assertEquals(false,balance.isBalance(input));
	}
	@Test
	public void When_StringhasDifferentSetOfOpenAndCloseBrackets_Expect_false()
	{
		String input = "(][){}";
		
		assertEquals(false,balance.isBalance(input));
	}
	@Test
	public void When_StringhasSameSetOfOpenAndCloseBrackets_Expect_false()
	{
		String input = "{[()]}";
		
		assertEquals(true,balance.isBalance(input));
	}
}
