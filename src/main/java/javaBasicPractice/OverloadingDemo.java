package javaBasicPractice;

public class OverloadingDemo {
	
	int a;
	int b;
	int c;
	
	public void area(int a, int b)
	{
		System.out.println(a+b); 
	}
	
	public void area(int...a)
	{
		System.out.println(a.length);
		for(int x:a)
		{
			System.out.println(x);
		}
	}
	
	public void area(int a, int b, int c) {
		System.out.println(a+b+c); 
	}

	public static void main(String[] args) {
		
		OverloadingDemo old=new OverloadingDemo();
		old.area(10, 20);
		old.area(10,  20,  30);
		old.area(10, 20, 30, 40);
		old.area(90);
		
		

	}

}
