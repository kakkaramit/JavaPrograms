package javaBasicPractice;

public class BoxingDemo {
	
	static int i=100;
	static double d=75.89;
	static float f=75.89f;
	static String s="Taj";
	static String s1="789";
	static String s2="True";

	public static void main(String[] args) {
		
		Integer in=i;
		System.out.println(in);
		
		Integer in1=(int) d;
		System.out.println(in1);
		
		Double d1=d;
		System.out.println(d1);
		
		Integer in5=(int) f;
		System.out.println(in5);
		
		Integer in2=Integer.valueOf(i);
		System.out.println(in2);
		
		Integer in3=Integer.valueOf(s1);
		System.out.println(in3);
		
		Integer in4=Integer.parseInt(s1);
		System.out.println(in4);
		
		Boolean b=Boolean.valueOf(s2);
		Boolean b1=Boolean.parseBoolean(s1);
		
		System.out.println(b1);
		
		System.out.println(b);
		
		
		System.out.println(String.valueOf(i));
		System.out.println(d1.toString());
		
		
	}

}
