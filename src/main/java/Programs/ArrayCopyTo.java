package Programs;


public class ArrayCopyTo {
	 public static void main(String[] args) {  
	        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
	                'i', 'n', 'a', 't', 'e', 'd' };  
	        char[] copyTo = new char[9];  
	  
	        System.arraycopy(copyFrom, 2, copyTo, 0, 9);  
	        System.out.println(new String(copyTo));  
	    }  
}
