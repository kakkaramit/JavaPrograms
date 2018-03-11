package Programs;
public class GenericClassDemo <T> {
	
	T a;
	
	public void setValue(T a)
	{
		this.a=a;
	}

	public T getValue()
	{
		return a;
	}
	public static void main(String[] args) {
		
		GenericClassDemo<Integer> gen1=new GenericClassDemo<Integer>();
		GenericClassDemo<String> gen2=new GenericClassDemo<String>();
		
		gen1.setValue(200);
		gen2.setValue("New String");
		
		System.out.println("Integer value is "+gen1.getValue()+" "+"String value is " +gen2.getValue());

	}

}
