package Week6;

import java.util.*;

/*
 * Demo application for stack
 */
public class StackDemo {

	
	
	public static void main(String[] args)
	{
		
		
		
	}
	
	/*
	 * Sample code for check palindrome
	 */
	public static boolean checkPalindrome(String str)
	{
		Stack<Character> stk = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++)
		{
			stk.push(str.charAt(i));
		}
		
		
		StringBuilder ret = new StringBuilder();
		
		for (Character ch: stk)
		{
			ret.append(ch);			
		}
		
		return str.equals(ret.toString());
		
	}
	
	
	/*
	 * Sample code for reverse linked List
	 */
	public static void revLinkedList(LinkedList<Integer> input)
	{
		Stack<Integer> stk = new Stack<Integer>();
		for (Integer item: input)
		{
			stk.push(item);
		}
		
		LinkedList<Integer> ret = new LinkedList<Integer>();
		
		for (Integer item: stk)
		{
			ret.add(item);
		}
		
		input = ret;		
	}
	
	/*
	 * Sample code for check balanced parentheses 
	 */
	
	public static boolean checkBalPar(String str)
	{
		 Stack<Character> stk = new Stack<Character>();
	   
	   for (int i = 0; i < str.length(); i++)
	   {
		   char ch = str.charAt(i);
		   
		   if (ch == '(')
		   {
			   stk.push(ch);
			   continue;
		   }
		   
		   if (ch == ')')
		   {
			   
			   if (!stk.isEmpty() && stk.peek() == '(')
			   {
				   stk.pop();
				   continue;
			   }
			   
			   stk.push(ch);				   
		   }		   
	   }
	   return stk.isEmpty();
		
	}
	
	
	
}