package assignment;

import java.util.Arrays;

public class Array_B11 {
/*B11. W.A.J.P to sort a numeric array and a string array.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array1 = {20,10,15,85,32,12};
         
		    String[] array2 = {"cow","lion","buffalo","leopard","dog","cat"};  
		    
		    System.out.println("Original numeric array : "+Arrays.toString(array1));
		    Arrays.sort(array1);
		    System.out.println("Sorted numeric array : "+Arrays.toString(array1));
		    
		    System.out.println("Original string array : "+Arrays.toString(array2));
		    Arrays.sort(array2);
		    System.out.println("Sorted string array : "+Arrays.toString(array2));
		    }

	}


