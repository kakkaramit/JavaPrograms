package javaBasicPractice;

public class UnBoxingDemo {
	
	
	public static void main(String[] args) {
	
		Integer i=new Integer(101);
		int i1=i;
		int i2=i.intValue();
		System.out.println(i1);
		System.out.println(i2);
		
		Double d=new Double(125.23);
		double d1=d;
		double d2=d.doubleValue();
		System.out.println(d1);
		System.out.println(d2);
		
//		int i2=d;
//		System.out.println(i2);
		
		Boolean b=new Boolean(true);
		boolean b1=b;
		boolean b2=b.booleanValue();
		System.out.println(b1);
		System.out.println(b2);
		
		String s1=new String("Taj Mahal");
		

	}

}
