package assignment;

import java.util.Arrays;

public class Array_B23 {
/*W.A.J.P to find the second largest element in an array.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {20,10,15,85,32,12};
        Arrays.sort(a);
	    System.out.println("second largest number in array is : "+ a[a.length-2]);

	}

}
