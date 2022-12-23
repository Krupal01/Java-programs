package assignment;

import java.util.Scanner;

public class B35 {
/*B35. Write a Java program to break an integer into a sequence of individual digits. Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int i = s.nextInt();
		int j;
		int reverse,R=0;
		while(i>0) {
			reverse=i%10;
			R=(R*10)+reverse;
			i/=10;
		}
		
		while(R>0) {
			j=R%10;
			System.out.print(j+" ");
			R/=10;
		}
		

	}

}
