package javaBasicPractice;

class Car{
	
	String name;
	int age;
	
	public void engien() {
		System.out.println("Engien method of parent class");
	}
}

class Zen extends Car{
	
	public void engien() {
		super.engien();
		System.out.println("Engien method of child class");	
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Car c=new Car();
		Zen z=new Zen();
		
		c.engien();
		
		z.engien();
		
	}

}
