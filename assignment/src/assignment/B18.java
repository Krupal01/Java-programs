package assignment;

import java.util.Scanner;

public class B18 {
/*B18. Write a Java program that takes a year from user and print whether that year is a leap year or not.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter year");
		int year;
		Scanner s = new Scanner (System.in);
		year = s.nextInt();
		
		if(year % 400==0) {
			System.out.println("year "+ year + " is leap year");
		}
		else if (year % 100 ==0) {
			System.out.println("year "+ year + " is not leap year");
		}
		else if (year % 4 == 0) {
			System.out.println("year "+ year + " is leap year");
		}
		else {
			System.out.println("year "+ year + " is not leap year");
		}
		
		s.close();
	}

}
