package oopsConcepts;

public class ThisConceptDemo {

	ThisConceptDemo(int a, int b, int c)
	{
		this(a, b);		
		System.out.println("Three arg constructor");
		System.out.println("c="+c);
	}

	ThisConceptDemo(int a, int b)
	{
		this(a);	
		System.out.println("two arg constructor");
		System.out.println("b="+b);
	}


	ThisConceptDemo(int a)
	{
		System.out.println("This is one arg constructor");
		System.out.println("a="+a);
	}



	public static void main(String[] args) {
		ThisConceptDemo tc=new ThisConceptDemo(10, 20, 30);


	}

}
