package oopsConcepts;

public class ThisDemo4 {
	
	int a;
	int b;
	ThisDemo4()
	{
		a=10;
		b=20;
	}
	
	void display(ThisDemo4 obj)
	{
		System.out.println(a+"          "+b);
	}
	
	void get()
	{
		display(this);
	}

	public static void main(String[] args) {
		
		ThisDemo4 td4=new ThisDemo4();
		td4.get();
		
	}

}
