package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Array_B19 {
/*I3. W.A.J.P to insert an element (specific position) into an array.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int element=s.nextInt();
		int index = s.nextInt();
		int a[]= {10,11,12,13,14,15};
		System.out.println("array is: "+ Arrays.toString(a));
		add(element ,index ,a);

	}

public static void add(int element, int index, int[] a) {
	// TODO Auto-generated method stub
	int array[]= new int[a.length+1];
	for(int i = 0; i<(a.length+1); i++) {
		if (i<index) {
			array[i]=a[i];
		}
		else if(i==index) {
			array[i]=element;
		}
		else {
			array[i]=a[i-1];
		}
	}
	System.out.println("new array is: "+ Arrays.toString(array));
}


}
/* int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    // Insert an element in 3rd position of the array (index->2, value->5)
   
   int Index_position = 2;
   int newValue    = 5;

  System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  for(int i=my_array.length-1; i > Index_position; i--){
    my_array[i] = my_array[i-1];
   }
   my_array[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(my_array));*/
