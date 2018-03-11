package javaBasicPractice;

class demo{
	
	static int s=1;

	static {
		System.out.println("This is a static block");
	}
}

public class StaticJavaDemo{
	

	public static void main(String[] args) {
		
		//demo d=new demo();
		System.out.println(demo.s);
		System.out.println("This is a main method");

	}

}
