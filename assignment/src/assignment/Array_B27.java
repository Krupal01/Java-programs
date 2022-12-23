package assignment;

import java.util.Arrays;

public class Array_B27 {
/*A4. W.A.J.P to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
		Arrays.sort(a);
		System.out.println("new array is : " + Arrays.toString(a) );

	}
}
