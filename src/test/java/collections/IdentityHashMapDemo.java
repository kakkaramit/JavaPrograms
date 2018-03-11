package collections;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap<String, String> hm=new IdentityHashMap<String, String>();
		hm.put("A", "Chandigarh");
		hm.put("C", "Mohali");
		hm.put("B", "Chandigarh");
		hm.put("D", "Patiala");
		hm.put("A", "Moga");
		hm.put("E", "Himachal");
		hm.put("F", "Moga");
		
		System.out.println(hm);
		//hm=null;
		System.gc();
		
		Set<String> s=hm.keySet();
		
		System.out.println("Set keys are----> "+s);
		
		Collection<String> c=hm.values();
		
		System.out.println("Collection values are---> "+c);
		
		Set<Entry<String, String>> s1=hm.entrySet();
		
		Iterator<Entry<String, String>> i=s1.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<String, String> m=(Map.Entry<String, String>)i.next();
			
			System.out.println(m.getKey()+"     "+ m.getValue());
			if(m.getKey().equals("D"))
			{
				m.setValue("Solan");
			}
		}
		System.out.println(hm);
		
		
	}
	
	public void finalize()
	{
		System.out.println("Finalized method called.");
	}

}
