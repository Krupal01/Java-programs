package assignment;

import java.util.Arrays;

public class Array_B25 {
/*A2. W.A.J.P to compute the average value of an array of integers except the largest and smallest values.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {52,14,23,21,41,23,10};
		Arrays.sort(a);
		
		int sum = 0;
		for (int i =1; i<a.length-1; i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		int avg = sum/(a.length-2);
		System.out.println("avrage of array is : "+avg);

	}

}
