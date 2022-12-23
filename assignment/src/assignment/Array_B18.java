package assignment;

import java.util.Arrays;
/*W.A.J.P to copy an array by iterating the array.*/
public class Array_B18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int[] array = {11,12,13,14,15,16,17,18,19,20};
		   int[] new_array = new int[10];     
		 
		   System.out.println("Source Array : "+Arrays.toString(array));     
		   
		   for(int i=0; i < array.length; i++)
		   {
		    new_array[i] = array[i];
		   }
		   System.out.println("New Array: "+Arrays.toString(new_array));
		 }
		 

	}


