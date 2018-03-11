package javaString;

import java.util.StringTokenizer;

public class StringTokenMethod {

	public static void main(String[] args) {


		String str="Taj Mahal is in Agra.";
		StringTokenizer stk=new StringTokenizer(str); 
		while(stk.hasMoreTokens())
		{
			System.out.println(stk.nextToken());
		}
		
		String str1= stk.toString();
		
		System.out.println(str1);
		
	}

}
