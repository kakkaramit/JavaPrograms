package ScannerDemo;

public class ArgsTest {

	public static void main(String[] args) {

		if(args.length > 0)
		{
			System.out.println("Command Line arguments are:");
			
			for(String sr:args)
			{
				System.out.println(sr);
			}
		}
	}

}
