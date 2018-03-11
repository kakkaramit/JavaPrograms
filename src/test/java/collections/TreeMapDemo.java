package collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
	
	

	public static void main(String[] args) {

		TreeMap<String, String> hm=new TreeMap<String, String>(new MyComparator6());
		hm.put("A", "Chandigarh");
		hm.put("C", "Mohali");
		hm.put("B", "Chandigarh");
		hm.put("D", "Patiala");
		hm.put("A", "Moga");
		hm.put("E", "Himachal");
		hm.put("F", "Moga");

		System.out.println(hm);



	}



}

class MyComparator6 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {

		return o2.compareTo(o1);
	}

}