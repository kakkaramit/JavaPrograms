package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("A");
		ts.add("a");
		ts.add("F");
		ts.add("2");
		ts.add("g");
		ts.add("a");
		ts.add("b");
		ts.add("Null");
		
		
		System.out.println(ts);
		
		TreeSet<String> ts1=new TreeSet<String>(new MyComparator());
		ts1.add("1");
		ts1.add("3");
		ts1.add("2");
		ts1.addAll(ts);
		ts1.add("Z");
		ts1.add("n");
		
		System.out.println("TS1--> "+ts1);
		
		
		System.out.println(ts1.headSet("b"));
		
		System.out.println(ts1.tailSet("Null"));
		
		System.out.println(ts1.subSet("b", "2"));

	}

}

class MyComparator implements Comparator<Object>
{

	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		
		return s1.compareTo(s2);
	}
	
}

class MyComparator1 implements Comparator<Object>
{

	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		
		return s2.compareTo(s1);
	}
	
}
