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
		String output= obj.convert(99999999);
		assertEquals("Error Out of range",output);
		}
	public void test4()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(10);
		assertEquals("Ten",output);
		}
	public void test5()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(20);
		assertEquals("Twenty",output);
		}
	public void test6()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(16);
		assertEquals("Sixteen",output);
		}
	public void test7()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(22);
		assertEquals("TwentyTwo",output);
		}
	public void test8()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(100);
		assertEquals("OneHundred",output);
		}
	public void test9()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(256);
		assertEquals("Two Hundred Fifty Six",output);
		}
	public void test10()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(903);
		assertEquals("Nine Hundred Three",output);
		}
	public void test11()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(1123);
		assertEquals("One Thousand One Hundred Twenty Three",output);
		}
	public void test12()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(132956);
		assertEquals("One Lakh Thirty Two Thousand Nine Hundred Fifty Six",output);
		}
	public void test13()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(2000000);
		assertEquals("Two Crore",output);
		}
}
