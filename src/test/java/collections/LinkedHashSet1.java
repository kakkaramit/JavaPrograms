package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<String>();
		hs.add("Chandigarh");
		hs.add("Patiala");
		hs.add("Batala");
		hs.add("Mohali");
		hs.add("Jagadhri");
		
		System.out.println(hs);
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Moga");
		lhs.add("Mohali");
		lhs.addAll(hs);
		lhs.add("3");
		lhs.add("5");
		lhs.add("Ludhiana");
		
		
		System.out.println(lhs);

	}

}
