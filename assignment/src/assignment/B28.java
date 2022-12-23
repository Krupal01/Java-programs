package assignment;

import java.util.Scanner;

public class B28 {
/*B28. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Input number: 5*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter number:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		n=n+(n*11)+(n*111);
		System.out.println(n);

	}

}
