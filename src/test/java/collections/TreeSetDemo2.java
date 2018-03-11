package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {

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

	}

}

class MyComparator2 implements Comparator<Object>
{

	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		
		return s1.compareTo(s2);
	}
}