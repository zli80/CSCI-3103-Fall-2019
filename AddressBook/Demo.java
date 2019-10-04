package Week5;

import java.util.LinkedList;

public class Demo {
	
	public static void main(String[] args)
	{
		AddressBook ab = new AddressBook();
		
		ab.add(new Contact("Joe", 45687));		
		ab.add(new Contact("Chris", 15687));		
		ab.add(new Contact("Grace", 95687));
		
		ab.dislay();
		
	}
	

}
