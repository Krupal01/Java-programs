package assignment;

import java.util.Arrays;

public class Array_B21 {
/*I5. W.A.J.P to find the duplicate values of an array of integer values.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,11,12,12,13,14,14,14,15};
		System.out.println("our array is : "+Arrays.toString(a));
				
		System.out.println("duplicate value in array is : ");
		for(int i =0; i<a.length; i++)
		{
			for(int j=a.length-1; j>i; j--) {
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
			
		}
	


	}

}
