package oopsConcepts;

public class ThisDemo3 {
	
	int a;
	int b;
	 
	ThisDemo3()
	{
		a=10;
		b=30;
	}

	
	void display()
	{
		System.out.println(a+"    "+b);
	}
	public static void main(String[] args) {
		ThisDemo3 td3=new ThisDemo3();
		td3.display();

	}

}
