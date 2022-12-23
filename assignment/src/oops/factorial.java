package oops;
/*I1. Write a program to print the factorial of a number by defining a method 
 * named ‘Factorial’. Factorial of any number n is represented by n! and is equal
 *  to 1*2*3*.... *(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6*/
import java.util.Scanner;

public class factorial {
	
	public static int factorial(int i) {
		int factorial=1;
		while(i!=0) {
			factorial=factorial*i;
			i--;
		}
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int I = s.nextInt();
		
		System.out.println("factorial is "+factorial(I));
		s.close();
	}

}
