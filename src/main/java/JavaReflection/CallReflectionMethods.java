package JavaReflection;

public class CallReflectionMethods{


	public static void methodCall1(String name) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException
	{
		Object obj=Class.forName(name).newInstance();
		System.out.println(obj.getClass().getName());
		
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException {

		methodCall1("JavaReflection.ReflectionTest");

	}
	
}
