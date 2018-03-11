package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Chandigarh");
		hs.add("Patiala");
		hs.add("Batala");
		hs.add("Mohali");
		hs.add("Jagadhri");
		
		System.out.println(hs);
		
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Delhi");
		hs1.add("Pune");
		hs1.addAll(hs);
		
		System.out.println(hs1);
		
		Iterator<String> i=hs1.iterator();
		while (i.hasNext())
		{
			String s=i.next();
			System.out.println(s);
		}
		

	}

}
