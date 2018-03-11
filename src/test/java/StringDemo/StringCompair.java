package StringDemo;

public class StringCompair {

	public static void main(String[] args) {

		String a="Welcome";
		String b="Welcome";
		String c= new String("Welcome");
		String d= new String("Welcome");
		String e= new String("Welcome").intern();


		System.out.println("String corresponding to b is "+b);
		System.out.println("String corresponding to a is "+a);

		System.out.println("Comapre method "+a.compareTo(b));

		System.out.println(a==b);

		System.out.println("Equals Method "+a.equals(b));

		System.out.println("**************************************");

		System.out.println("Comapre method with new "+a.compareTo(c));

		System.out.println(a==c);

		System.out.println("Equals Method "+a.equals(c));

		System.out.println("**************************************");

		System.out.println("Comapre method with new "+d.compareTo(c));

		System.out.println(c==d);

		System.out.println("Equals Method "+d.equals(c));
		
		System.out.println("**************************************");
		
		System.out.println("Comapre method "+a.compareTo(e));

		System.out.println(a==e);

		System.out.println("Equals Method "+a.equals(e));
		

	}

}
