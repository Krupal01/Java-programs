package assignment;

import java.util.Scanner;

public class B25 {
/*B25. Write a Java program that reads a positive integer and count the number of digits the number.
Input an integer number less than ten billion: 125463
Number of digits in the number: 6*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,digit=0;
		System.out.println("Input an integer number less than ten billion: 125463");
		Scanner s= new Scanner(System.in);
		i= s.nextInt();
		while(i!=0) {
			i/=10;
			digit++;
		}
		System.out.println("Number of digits in the number: "+digit);
		s.close();

	}

}
