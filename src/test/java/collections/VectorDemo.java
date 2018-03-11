package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
		v.addElement("chd");
		
		v.add("Batala");
		v.addElement("Moga");
		v.add("Asr");
		v.add("Ludhiana");
		v.add(2, "Patiala");
		System.out.println(v.get(3));
		
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		System.out.println(v);
		
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements())
		{
			String s=e.nextElement();
			System.out.println(s);
			
			if(s.equals("Patiala"))
			{
				System.out.println("Patiala Found.");
			}
			
		}
		
		

	}

}
