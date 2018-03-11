package javaBasicPractice;

public class TypeCastingDemo {

	public static void main(String[] args) {
		char c='A';
		int i=c;
		long l=i;
		float f=l;
		double d=f;
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		
		System.out.println("*****************************************************");
		double d1=78.98;
		float f1=(float) d1;
		long l1=(long) f1;
		int i1=(int) l1;
		byte b1=(byte) d1;
		char c1=(char) i1;
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(b1);
		System.out.println(c1);
		
		
		
		
		
	}

}
