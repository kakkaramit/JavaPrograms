package javaString;

import java.nio.charset.Charset;

public class StringMethods {
	
	public static void main(String args[])
	{
//		String str="very";
//		str="good";
//		System.out.println(str);
		
//		String str=new String("very");
//		str="good";
//		System.out.println(str);
		
//		byte[] str= {65, 109, 105, 116};
//		String str1=new String(str);
//		System.out.println("My name is " +str1);
		
		byte[] str= {65, 109, 105, 116};
		Charset cs = Charset.defaultCharset();
		String str1=new String(str, cs);
		System.out.println("My name is " +str1 +" "  + cs);
		
		char[] cr1= {65, 109, 105, 116};
		String str2= new String(cr1);
		System.out.println(str2);
		
		
		String a= "Taj Mahal";
		int b=a.length();
		System.out.println("Length of string is "+b);
		
		System.out.println("Character at place 5 is "+ a.charAt(5));
		
		System.out.println("Sub string "+a.substring(4, 8));
		
		System.out.println("sub string of a "+a.substring(6));
		
		//System.out.println("Invalid index of sub string "+a.substring(10,14));
		
		String s1="New";
		String s2="Dehli";
		
		System.out.println("Concat string is "+ s1.concat(s2));
		
		System.out.println("Concat string using + is "+ s1 +" "+s2);
		
		System.out.println("Upper Letters "+ a.toUpperCase());
		System.out.println("Lower Letters "+ a.toLowerCase());
		
		
		String s3= "Amit";
		String s4= "Amit";
		String s5= new String("Amit");
		
		System.out.println("Equals Method "+ s3.equals(s4));
		System.out.println("Equals ignorecase Method "+ s3.equalsIgnoreCase(s4));
		
		
		System.out.println("compair to Method "+ s3.compareTo(s4));
		
		System.out.println("compair to Method using new keyword "+ s3.compareTo(s5));
		
		System.out.println("compair to Method using == keyword "+ s3==s5);
		
		System.out.println("*******************************");
		String b1="Taj Mahal is in Agra.";
		String[] splt= b1.split(" ", 5);
		for(String spl:splt)
		{
			System.out.println(spl);
		}
	}

}
