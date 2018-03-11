package JavaReflection;

public class ReflectionTest {
 String age;
 String name;
 
 public ReflectionTest(String age, String name)
 {
	 this.age=age;
	 this.name=name;
 }
	
public void method1()
{
	System.out.println("Method1 age" +age);
	System.out.println("Method1 name" +name);
}

public void method2()
{
	System.out.println("Method2 age" +age);
	System.out.println("Method2 name" +name);
}

public void method3()
{
	System.out.println("Method3 age" +age);
	System.out.println("Method3 name" +name);
}
	
}
