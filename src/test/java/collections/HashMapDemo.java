package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static <K> void main(String[] args) {
		
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("A", "Chandigarh");
		hm.put("C", "Mohali");
		hm.put("B", "Chandigarh");
		hm.put("D", "Patiala");
		hm.put("A", "Moga");
		hm.put("E", "Batala");
		
		System.out.println(hm);
		
		HashMap<String, String> hm1=new HashMap<String, String>();
		hm1.put("A", "Chandigarh");
		hm1.put("C", "Mohali");
		hm1.put("B", "Chandigarh");
		hm1.put("D", "Patiala");
		hm1.put("A", "Moga");
		hm1.put("E", "Batala");
		hm1.putAll(hm);
		hm1.put("F", "Ludhiana");
		
		System.out.println(hm1);
		
		
		Set<String> s1=hm1.keySet();
		System.out.println("keyset--> "+s1);
		
		Collection<String> c=hm1.values();
		
		System.out.println("Values--> "+c);
		
		Set<Entry<String, String>> s2=hm1.entrySet();
		System.out.println("EntrySet-->"+s2);
		
		Iterator<Entry<String, String>> i=s2.iterator();
		while(i.hasNext())
		{
			Map.Entry<String, String> m=(Map.Entry<String, String>)i.next();
			
			System.out.println(m.getKey()  +"    "+m.getValue());
			
			if(m.getValue().equals("Moga"))
			{
				m.setValue("ASR");
			}
			
		}
		System.out.println(hm1);
		
	}

}
