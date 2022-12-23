package assignment;

import java.util.Scanner;

public class B34 {
/*B34. Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.
Input first number: 5
Input second number: 1
false*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number: ");
		double a = s.nextDouble();
		System.out.println("enter second number: ");
		double b = s.nextDouble();
		if(a>0 && a<1 && b>0 && b<1 )
		{
			System.out.println("true");
		}

	}

}
