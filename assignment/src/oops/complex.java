package oops;

import java.util.Scanner;

/*B42. Print the sum, difference and product of two complex
 *  numbers by creating a class named ‘Complex’ with separate
 *  methods for each operation whose real and imaginary parts are entered by user.*/
public class complex {
	
	public static void sum(int r1,int r2,int i1,int i2){
		System.out.println("sum of two complex number is : "+(r1+r2)+" +j"+(i1+i2));
	}
	
	public static void difference(int r1,int r2,int i1,int i2) {
		System.out.println("difference of two complex number is : "+(r1-r2)+" +j"+(i1-i2));
	}
	
	public static void product(int r1,int r2,int i1,int i2) {
		System.out.println("product of two complex number is : "+((r1*r2)-(i1*i2))+" +j"+((r2*i1)+(r1*i2)));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter real value of complex number1 : ");
		int r1 = s.nextInt();
		System.out.println("enter real value of complex number2 : ");
		int r2 = s.nextInt();
		System.out.println("enter imaginary value of complex nuber1 : ");
		int i1 = s.nextInt();
		System.out.println("enter imaginary value of complex nuber2 : ");
		int i2 = s.nextInt();
		
		sum(r1,r2,i1,i2);
		difference(r1,r2,i1,i2);
		product(r1,r2,i1,i2);

	}

}
