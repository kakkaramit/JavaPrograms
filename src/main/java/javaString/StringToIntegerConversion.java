package javaString;

public class StringToIntegerConversion {

	public static void main(String[] args) {

		String str1="geeks";

		int a=Integer.parseInt(str1, 29);
		System.out.println(a);


		String str2="-20";

		int b=Integer.parseInt(str2, 29);
		System.out.println(b);

	}

}
