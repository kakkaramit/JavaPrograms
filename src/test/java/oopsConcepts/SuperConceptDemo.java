package oopsConcepts;

class A{
	
	int a;
	int b;
	
	A(int a, int b){
		
		this.a=a;
		this.b=b;	
	}
	
	void display() {
		System.out.println("Parent class method.");
		System.out.println("a="+a +"   "+"b="+b);
	}
	
}

class B extends A{

	B(int a, int b) {
		super(a, b);
		
	}
	
	void display() {
		super.display();
		System.out.println("Child class method.");
		System.out.println("a="+a +"   "+"b="+b);
	}
	
}

public class SuperConceptDemo {

	public static void main(String[] args) {
		
		B b=new B(20, 30);
		b.display();

	}

}
