package nissan.NumbertoWords;

import static org.junit.Assert.*;

import org.junit.*;

public class NumberWordsTests {
	private NumberWordsApplication numberWordsApplication ;
	
	@Before

	@Test
	public void test1()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(1);
		assertEquals("One",output);
		}
	
	public void test2()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(-1);
		assertEquals("Error Negative Numbers",output);
		}
	
	public void test3()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(9999999);
		assertEquals("Error Out of range",output);
		}
	
}
