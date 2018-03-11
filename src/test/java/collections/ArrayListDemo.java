package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Chandigarh");
		al.add("Punjab");
		al.add("Patiala");
		al.add("Panchkula");
		al.add("Shimla");
		al.add("Delhi");
		al.add("null");
		al.add("Chandigarh");
		al.add("null");
		
		System.out.println("Values of first array list are-----> "+al);
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Manali");
		al1.addAll(al);
		al1.add(4, "Sangla");
		al1.add("null");
		
		System.out.println(al1.get(4));
		
		System.out.println("Values of second array list before set method are-----> "+al1);
		al1.set(6, "Agra");
		al1.remove(5);
		
		System.out.println("Values of second array list after set method are-----> "+al1);
		
		List<String> l1=Collections.synchronizedList(al1);
	
		
		System.out.println("Values of synchronized lit are--->"+l1);
		
//		Method[] methods=Collections.class.getMethods();
//		
//		for(Method method:methods)
//		{
//			System.out.println(method);
//		}
		
		System.out.println("*********************Iterator**********************");
		
		Iterator<String> i=al1.iterator();
		while(i.hasNext())
		{
			String s=i.next();
			//System.out.println("Before remove "+s);
			if(s.equals("null"))
			{
				i.remove();
			}
			
		}
		System.out.println("After remove "+al1);
		
		System.out.println("*********************List Iterator**********************");
		
		ListIterator<String> l=al1.listIterator();
		while(l.hasNext())
		{
			String s1=l.next();
			if(s1.equals("Agra"))
			{
				l.remove();
			}
		}
		
		System.out.println("After remove "+al1);
		
	}
	
	
	

}
