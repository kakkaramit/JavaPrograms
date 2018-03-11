package oopsConcepts;

public class ThisConceptDemo2 {
	
	int a;
	int b;
	
	ThisConceptDemo2(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void method1()
	{
		System.out.println("This is a method1.");
	}
	
	void display()
	{
		this.method1();
		System.out.println("a="+a +"    "+"b="+b);
	}
	

	public static void main(String[] args) {
		
		ThisConceptDemo2 tc1=new ThisConceptDemo2(20, 30);
		tc1.display();
	}

}
