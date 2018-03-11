package oopsConcepts;

public class ThisDemo2 {
	
	int a;
	int b;
	
	ThisDemo2(){
		this(20, 50);
		System.out.println("Inside  default constructor \n");
	}

	

	public ThisDemo2(int i, int j) {
		a=i;
		b=j;
		System.out.println("Inside parameterized constructor");
	}

	void show()
	{
		System.out.println(a+"      "+b);
	}


	public static void main(String[] args) {
		ThisDemo2 td2=new ThisDemo2();
		td2.show();
		

	}

}
