package assignment;

import java.util.Scanner;

public class B20 {
/*B20. Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		int sum=0, avg;
		System.out.println("enter values:");
		for(int i=0; i<a.length; i++) {
			Scanner s = new Scanner(System.in);
			a[i]= s.nextInt();
			sum+=a[i];
			
		}
		
		avg= sum/5;
		System.out.println("sum of the numbers is "+ sum);
		System.out.println("average ofthe numbers is "+ avg);
		
	}

}
