package javaBasicPractice;

class Array1{
	static String s[]= {"taj", "Mahal", "is", "in", "Agra"};
}

public class ArrayDemo {
	
	

	public static void main(String[] args) {
		
//		for(int i=0;i<s.length;i++)
//		System.out.println(s[i]);
		
		for(String s1:Array1.s)
		{
			System.out.println(s1);
		}
	}

}
