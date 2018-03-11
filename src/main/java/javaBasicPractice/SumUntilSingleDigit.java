package javaBasicPractice;

public class SumUntilSingleDigit {

	public static void main(String[] args) {
		
		int a =123456;
		int sum=0;
		
		while(a>9)
		{
			sum=0;
		while(a>0){		
			int rem;
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		a=sum;
		}
		
		System.out.println(sum);
	}

}
