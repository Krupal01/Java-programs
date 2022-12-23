package assignment;

import java.util.Scanner;

public class B26 {
/*B26. Write a Java program to count the letters, spaces, numbers and other characters of an input string.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i;
		System.out.println("enter String...");
		Scanner s =new Scanner(System.in);
		i=s.nextLine();
		System.out.println("total character in string is " + i.length());
		s.close();
	}

}
