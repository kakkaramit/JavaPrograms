package collections;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {

		WeakHashMap<String, String> wh=new WeakHashMap<String, String>();
		wh.put("A", "Chandigarh");
		wh.put("C", "Mohali");
		wh.put("B", "Chandigarh");
		wh.put("D", "Patiala");
		wh.put("A", "Moga");
		wh.put("E", "Himachal");
		wh.put("F", "Moga");
		wh.put("G", "Chandigarh");
		
		System.out.println(wh);
		
		wh=null;
		System.gc();
		
		Runtime.getRuntime().gc();
		
		
		
		
		
		WeakHashMap<String, String> wh1=new WeakHashMap<String, String>();
		wh1.put("A", "Chandigarh");
		wh1.put("C", "Mohali");
		wh1.put("B", "Chandigarh");
		wh1.put("D", "Patiala");
		wh1.put("A", "Moga");
		wh1.put("E", "Himachal");
		wh1.put("F", "Moga");
		wh1.put("G", "Chandigarh");
		
		System.out.println(wh1);
		
		wh1=null;
	}
	
	public void finalize()
	{
		System.out.println("Finalized method called.");
	}

}
