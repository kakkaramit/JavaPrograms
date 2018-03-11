package Programs;


public class ArrayClass {
	static void min1(int arr[]){  
		int min=arr[0]; 
		for(int i=1;i<arr.length;i++)  
		 if(min>arr[i])  
		  min=arr[i];  
		  
		System.out.println(min);  
		
		
		}  
	static void max1(int arr[]){
		int max=arr[0];
		for(int j=1;j<arr.length;j++)  
			 if(max<arr[j])  
			  max=arr[j];  
			  
			System.out.println(max);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={33,3,92,5, 2};  
		min1(a);//passing array to method  
		max1(a);
	}

}
