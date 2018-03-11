package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("A");
		l1.add("2");
		l1.add("yz");
		l1.addFirst("null");
		
		System.out.println(l1.getLast());
		
		System.out.println(l1);
		
		ListIterator<String> l=l1.listIterator();
		while(l.hasNext())
		{
			String s1=l.next();
			if(s1.equals("yz"))
			{
				l.remove();
			}
			
			if(s1.equals("null"))
			{
				l.hasNext();
			}
		}
		
		System.out.println("After remove "+l1);
		

	}

}
