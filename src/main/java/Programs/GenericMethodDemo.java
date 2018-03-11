package Programs;
public class GenericMethodDemo {

	public <M> void print(M a[])
	{
		for(M b:a)
		System.out.println("Print value is "+b);
	}

	public static void main(String[] args) {

		GenericMethodDemo gen=new GenericMethodDemo();
		//Integer abc[] = new Integer[]{100, 200, 300, 400};
	//	String abcd[] = new String[] {"Chandigarh", "Mohali", "Panchkula"};
		//gen.print(abc);
	//	gen.print(abcd);
		
		gen.print(new Integer[]{100, 200, 300, 400});
		gen.print(new String[] {"Chandigarh", "Mohali", "Panchkula"});
		//gen.print(10, 20, 30, 40);
	}

}
