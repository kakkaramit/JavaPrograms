package javaBasicPractice;

public class Singalton {
	
	//1. Make a private constructor of a class
	//2. Make a public static (get instance) method lazy initialization
	
	private static Singalton instance=null;
	
	private Singalton() {
		
	}

	public static Singalton getInstance() {
		if(instance ==null)
			instance=new Singalton();
		return instance;
	}
	public static void main(String[] args) {
		
		Singalton sgt=Singalton.getInstance();
		

	}

}
