package assignment;

import java.util.Scanner;

public class Array_B15 {
/*B15. W.A.J.P to find the index of an array element.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 11, 12, 13, 14, 15, 16};
		int index=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter element to find its index : ");
		int f=s.nextInt();
		for(index=0; index<a.length; index++)
		{
			if(a[index]==f)
			{
				break;
			}
			
		}
		System.out.println("index of given element is : " + index);
		

	}

}
