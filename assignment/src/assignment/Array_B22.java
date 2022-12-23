package assignment;

import java.util.Arrays;

public class Array_B22 {
/*I6. W.A.J.P to find the duplicate values of an array of string values.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"cow","lion","buffalo","leopard","dog","cat","cat","cow"};
		System.out.println("our array is : "+Arrays.toString(a));
				
		System.out.println("duplicate value in array is : ");
		boolean test;
		for(int i =0; i<a.length; i++)
		{
			for(int j=a.length-1; j>i; j--) {
				if(test=a[i].equals(a[j]))
				{
					System.out.println(a[i]);
				}
			}
			
		}

	}

}
