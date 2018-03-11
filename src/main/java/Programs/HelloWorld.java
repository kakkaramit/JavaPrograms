package Programs;

class Test1
{
	public void display()
	{
		System.out.println("superclass method");
	}
}

class HelloWorld extends Test1
{


	public void display(String s)
	{

		String s1=s;
		System.out.println("subclass"+s1);
	}

	public static void main(String[] args)
	{

		HelloWorld obj1=new HelloWorld();
		obj1.display("Priya");

		Test1 test=new Test1();
		test.display();

		Test1 test2=new HelloWorld();
		test2.display();
		
	
		
		

	}



}