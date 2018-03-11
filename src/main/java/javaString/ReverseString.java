package javaString;

public class ReverseString {

	public static void main(String[] args) {

//		String a="Taj Mahal";
//		StringBuffer b=new StringBuffer(a);
//		b=b.reverse();
//		System.out.println(b);
//
//		for(int i=0; i<b.length(); i++)
//		{
//			System.out.println(b.charAt(i));
//		}
		
		
		String a="Taj Mahal";
		char[] ch=a.toCharArray();
		for(int i=ch.length-1; i>=0;i--)
		{
			System.out.println(ch[i]);
		}

	}

}
