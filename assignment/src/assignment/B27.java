package assignment;

import java.util.Scanner;

public class B27 {
/*B27. Write a Java program to print the ascii value of a given character.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		System.out.println("enter one charecter");
		Scanner i = new Scanner(System.in);
		a=i.next().charAt(0);
		int j= a;
		System.out.println(j);
		i.close();

	}

}
