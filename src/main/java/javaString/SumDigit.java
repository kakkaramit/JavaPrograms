package javaString;

public class SumDigit {

	public static void main(String[] args) {
		int n = 12345;
	    int sum = 0;
	    while (n > 9 ) {
	                 sum=0;
	        while (n > 0) {
	            int rem;
	            rem = n % 10;
	            sum = sum + rem;
	            n = n / 10;
	        }
	        n = sum;
	    }

	    System.out.println(sum);

	}

}
