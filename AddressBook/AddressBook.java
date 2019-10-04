package Week5;

import java.util.LinkedList;
import java.util.ListIterator;

public class AddressBook {
	
	LinkedList<Contact> dt = new LinkedList<Contact>();
	
	public void add(Contact item)
	{
		ListIterator<Contact> lst = dt.listIterator();
		
		while(lst.hasNext())
		{
			if (lst.next().compareTo(item) > 0)
			{
				lst.previous();
				lst.add(item);
				return;				
			}
			
		}
		lst.add(item);
	}
	
	public void dislay()
	{
		for (Contact item: dt)
		{
			System.out.println(item);
		}
		
	}

}
