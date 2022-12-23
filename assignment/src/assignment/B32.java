package assignment;

import java.util.Scanner;

public class B32 {

	/*B32. Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
Input the first number: 35
Input the second number: 45
Result: true */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A;
		int B;
		Scanner s = new Scanner(System.in);
		System.out.println("Input the first number:");
		A= s.nextInt();
		System.out.println("Input the second number: ");
		B = s.nextInt();
		
		if(A>25 && B>25 && A<75 && B<75)
		{
			String a = String.valueOf(A);
			String b = String.valueOf(B);
			if(a.charAt(0)==b.charAt(0) || a.charAt(0)==b.charAt(1) || a.charAt(1)==b.charAt(0) || a.charAt(1)==b.charAt(1) )
			{
				System.out.println("Result: true");
			}
			
		}
		
	}

}
