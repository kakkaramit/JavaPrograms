package StringDemo;

import java.io.UnsupportedEncodingException;

public class StringMethods {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String a="Taj Mahal is in Agra.";

		/*
		 * charAt Method
		 */
		char c=a.charAt(10);
		char c1=a.charAt(11);
		//char c2=a.charAt(110);

		System.out.println("Character at 10th and 11th index is "+c +" and " +c1);
//		try {
//			System.out.println("Character at 110th index is "+c2 );
//		} catch (IndexOutOfBoundsException e) {
//
//			e.printStackTrace();
//		}

		/*
		 * contains method
		 */
		System.out.println(a.contains("Agra"));
		
		System.out.println(a.contains("Chandigarh"));

		/*
		 * contains Method
		 */
		
		String b="Taj";
		System.out.println(b.hashCode());
		b=b.concat(" Mahal");
		
		System.out.println(b.hashCode());
		
		String s= new String("Punjab");
		System.out.println(s.hashCode());
		s=s.concat(" Chandigarh");
		System.out.println(s.hashCode());
		
		/*
		 * sub string method
		 */
		
		System.out.println("Sub string text after begin index---> "+ a.substring(9));
		
		System.out.println("Sub string particular text index----> "+ a.substring(8,17));
		
		/*
		 * Valueof method
		 */
		
		int i=10;
		float f=10.5f;
		double d=10.29;
		char ch='a';
		char ch1[]= {'a', 'b', 'c'};
		
		String s1= String.valueOf(i);
		String s2=String.valueOf(d);
		String s3=String.valueOf(f);
		String s4=String.valueOf(ch);
		String s5=String.valueOf(ch1);
		
		System.out.println("String value of int is -->"+s1 +" "+"String value of float is -->"+s3+
				" "+"String value of double is -->"+s2+" "+"String value of char is -->"+s4+" "+"String value of char array is -->"+s5);
		
		/*
		 * startWith method
		 */
		
		System.out.println("Startwith method------>" + a.startsWith("Ta"));
		System.out.println("Startwith method------>" + a.startsWith("is", 10));
		
		/*
		 * endsWith method
		 */
		
		System.out.println("Endswith method------>" + a.endsWith("agra."));
		
		/*
		 * indexof method
		 */
		
		System.out.println("Index of method---->"+a.indexOf("is"));
		
		/*
		 * Length method
		 */
		
		System.out.println("Length of string is---->"+a.length());
		
		/*
		 * lastIndexof method
		 */
		
		System.out.println("Last Index of method---->"+a.lastIndexOf("."));
		
		/*
		 * Replace method
		 */
		System.out.println(a.replace('i', 'I'));
		
		System.out.println(a.replace('a', 'A'));
		
		System.out.println(a.replace("is", "IS"));
		
		System.out.println(a.replaceAll("a", "A"));
		
		/*
		 * Split method
		 */
		
		String str = new String("28/12/2013");
		
		String sa[]=str.split("/");
		for(String sa1:sa)
		{
			System.out.println(sa1);
		}
		
		
		String sa12[]=str.split("/", 2);
		for(String sa2:sa12)
		{
			System.out.println(sa2);
		}
		
		
		/*
		 * is empty method
		 */
		
		String n="";
		
		System.out.println(n.isEmpty());
		
		
		/*
		 * Matches method
		 */
		
		System.out.println(a.matches("(.*)Agra."));
		
		/*
		 * To char array
		 */
		
		char ch3[]=a.toCharArray();
		for(char ch4:ch3)
		{
			System.out.println(ch4);
		}
		
		
		/*
		 * Get bytes
		 */
		
		byte by[]=a.getBytes();

		for(byte by1:by)
		{
			System.out.println(by1);
		}
		
		System.out.println("********************************************");
		byte by2[]=a.getBytes("UTF-16");

		for(byte by3:by2)
		{
			System.out.println(by3);
		}
		
		/*
		 * Join method
		 */
		
		String str4=String.join("_", "Hello", "World");
		System.out.println(str4);
		
		
		
		
		
		
		
		
		
		
	}

}
