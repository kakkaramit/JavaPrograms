package javaString;

public class StringBufferMethods {

	public static void main(String args[])
	{
		StringBuffer strb1=new StringBuffer("Taj Mahal");
		
		System.out.println("Length of string is: "+strb1.length());
		System.out.println("Capacity of string is: "+strb1.capacity());
		
		System.out.println("Append to string: "+ strb1.append(" in Agra."));
		System.out.println(strb1);
				
		System.out.println("Inserting to the string: " + strb1.insert(9, " is"));
		
		System.out.println("Replacement wthin string: "+ strb1.replace(10, 12, "IS"));
		
		System.out.println("Reverse of string is: "+strb1.reverse());
		
		System.out.println("**************************************");
		StringBuffer strb2=new StringBuffer("Taj Mahal");
		System.out.println("Append to string: "+ strb2.append(" is in Agra."));
		String str3=strb2.toString();
		
		System.out.println(str3);
		
	}
}
