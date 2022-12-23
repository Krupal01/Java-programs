package assignment;

import java.util.Scanner;

public class B16 {
/*B16. W.A.J.P to Take three numbers from the user and print the greatest number.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter any three number");
		int a =s.nextInt();
		int b =s.nextInt();
		int c=s.nextInt();
		
		if (a<b) 
		{
			if(b<c) {
				System.out.println("maximum : "+c);
			}
			else {
				System.out.println("maximum : "+b);
			}
		}
		else {
			if(a>c) {
				System.out.println("maximum : "+a);
			}
			else {
				System.out.println("maximum : "+c);
			}
		}
		

	}

}
