package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
		s.add("Chandigarh");
		s.push("Batala");
		s.push("Mohali");
		s.add("Panchkula");
		System.out.println(s.peek());
		System.out.println(s.pop());
		int a=s.search("Chandigarh");
		int b=s.search("Punjab");
		System.out.println("Value of a is--> "+a +"   "+"Value of b is---> "+b);
		System.out.println(s);
		

	}

}
