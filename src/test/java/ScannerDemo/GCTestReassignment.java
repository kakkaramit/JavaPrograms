package ScannerDemo;

/*
 * When variable is null.
 * When variable assigned to new variable means re assignment.
 * Object created within method 
 * Anonymous object is created. say -  new Test(); //without any reference variable.
 */



public class GCTestReassignment {
	
	int a;
	
	public GCTestReassignment(int a)
	{
		this.a=a;
	}

	public static void main(String[] args) {

		GCTestReassignment gc1=new GCTestReassignment(10);
		GCTestReassignment gc2=new GCTestReassignment(12);
		gc1=gc2;
		
		System.out.println(gc1.a);
		System.gc();
		

	}

	
	protected void finalize() throws Throwable
	{
		System.out.println(this.a+ " successfully garbage collected");
	}
}
