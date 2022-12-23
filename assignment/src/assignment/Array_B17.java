package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Array_B17 {
/*I1. W.A.J.P to remove a specific element from an array I2.*/
	
public static int[] removeTheElement(int[] arr, int index) 
{ 
		if (arr == null || index < 0 || index >= arr.length) 
		{
		return arr; 
		} 
		 
		int[] anotherArray = new int[arr.length - 1]; 
		
		 
		for (int i = 0, k = 0; i < arr.length; i++) 
		{ 		
		if (i == index)
		{ 
		continue; 
		} 
		anotherArray[k++] = arr[i]; 
		} 
		
		return anotherArray; 
} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,11,12,13,14,15};
		System.out.println(Arrays.toString(a));
		Scanner s= new Scanner(System.in);
		System.out.println("enter index nunber");
		int index=s.nextInt();
		a= removeTheElement(a, index); 
		System.out.println(Arrays.toString(a));	

	}

}
