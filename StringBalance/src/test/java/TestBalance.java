import static org.junit.Assert.assertEquals;

import org.junit.Test;

import balancing.MinStack;
import balancing.StringBalancing;

public class TestBalance {
	
	StringBalancing balance = new StringBalancing();
	MinStack stack = new MinStack();
	

	@Test
	public void When_StringHasSameSetOfOpenAndCloseBrackets_Expect_true()
	{
		String input = "()";
		
		assertEquals(true,balance.isBalance(input));
	}
	
	@Test
	public void When_StringhasSameSetOfOpenAndCloseBrackets_Expect_true()
	{
		String input = "({})";
		
		assertEquals(true,balance.isBalance(input));
	}
	@Test
	public void When_StringHasDifferentSetOfOpenAndCloseBrackets_Expect_true()
	{
		String input = "(][";
		
		assertEquals(false,balance.isBalance(input));
	}
	@Test
	public void When_StringhasDifferentSetOfOpenAndCloseBrackets_Expect_true()
	{
		String input = "(][){}";
		
		assertEquals(false,balance.isBalance(input));
	}
	@Test
	public void When_StringIsEmpty_Expect_false()
	{
		String input = "";
		
		assertEquals(false,balance.isBalance(input));
	}
}
