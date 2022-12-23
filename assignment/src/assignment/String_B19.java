package assignment;

import java.util.Scanner;

public class String_B19 {
/*W.A.J.P to compare a given string to the specified character sequence.
Comparing topsint.com and topsint.com: true
Comparing Topsint.com and topsint.com: false*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "topsint.com";
		Scanner s = new Scanner(System.in);
		System.out.println("enter string:");
		String b = s.nextLine();
		boolean test = false;
		if(a.equals(b)) {
			test = true;
		}
		System.out.println("Comparing "+a+" and "+b+": "+test);

	}

}
