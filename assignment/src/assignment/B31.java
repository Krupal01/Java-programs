package assignment;

import java.util.Scanner;

public class B31 {
/*B31. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,sum;
		
		Scanner s =new Scanner(System.in);
		System.out.println("enter 1st number:");
		a=s.nextInt();
		System.out.println("enter 2nd number:");
		b=s.nextInt();
		System.out.println("enter 3rd number:");
		c=s.nextInt();
		
		sum=a+b;
		if (sum == c) {
		System.out.println("true");	
		}
		s.close();

	}

}
