package assignment;

import java.util.Arrays;

public class Array_B28 {
/*A5. W.A.J.P to cyclically rotate a given array clockwise by one.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10, 20, 30, 40, 50, 60};
		int b[]=new int[a.length];
		
		System.out.println("array is:");
		System.out.println(Arrays.toString(a));

		for(int i =0; i<a.length; i++) {
			if(i==a.length-1) {
				b[0]=a[i];
			}
			else {
				b[i+1]=a[i];
			}
		}
		System.out.println("new array is:");
		System.out.println(Arrays.toString(b));

	}

}
