package Programs;
public class FiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int c,i;

System.out.println(a+""+b);

for(i=0; i<=10; i++){
	c=a+b;
	 System.out.print(" "+c);    
	  a=b;    
	  b=c;  
}
	}

}
