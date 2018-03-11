package javaBasicPractice;

class Animal{
	
	String name;
	int age;
	
	Animal(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void display()
	{
		System.out.println("Name and age of Animal is--->"+name +"  "+age);
	}
}

class Dog extends Animal
{
	Dog(String name, int age){
		super(name, age);
	}
	
	void display()
	{
		super.display();
		System.out.println("Name and age of dog is--->"+name +"  "+age);
	}
}

public class NormalInherienceDemo {

	public static void main(String[] args) {
		Animal a=new Animal("Tuffy", 6);
		Animal a1=new Dog("Bull", 9);
		Dog d=new Dog("Shaina", 3);
		
		a.display();
		a1.display();
		d.display();
		
//		Dog d1=(Dog)new Animal("Tomy", 4);  // class cast exception
//		d1.display();
		
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Animal);
		
		System.out.println("***************************************");
		System.out.println(a1 instanceof Dog);
		System.out.println(a1 instanceof Animal);
		
		System.out.println("***************************************");
		System.out.println(d instanceof Dog);
		System.out.println(d instanceof Animal);
	}

}
