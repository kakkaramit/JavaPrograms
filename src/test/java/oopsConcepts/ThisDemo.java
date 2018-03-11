package oopsConcepts;

public class ThisDemo {
	
	int a;
	int b;
	
	ThisDemo(int a, int b){
		this.a=a;
		this.b=b;
		
	}
	
	void display()
	{
		System.out.println(a+"    "+b);
	}

	public static void main(String[] args) {
		
		ThisDemo td=new ThisDemo(10, 20);
		td.display();
		
	}

}
