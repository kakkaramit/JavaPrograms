package ScannerDemo;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNextInt())
		{
			int a=sc.nextInt();
			System.out.println(a);
		}
	}

}
