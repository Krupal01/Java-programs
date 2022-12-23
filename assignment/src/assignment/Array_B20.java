package assignment;

import java.util.Arrays;

public class Array_B20 {
/*I4. W.A.J.P to reverse an array of integer values.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,11,12,13,14,15};
		System.out.println("our array is : "+Arrays.toString(a));
		int b[]= new int[a.length];		
		
		for(int i =a.length; i>0; i--)
		{
			
			b[i-1]=a[a.length-i];
		}
		System.out.println("reverse array is : "+Arrays.toString(b));

	}

}
