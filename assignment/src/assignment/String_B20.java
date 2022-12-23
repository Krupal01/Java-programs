package assignment;

import java.util.Scanner;

public class String_B20 {
/*W.A.J.P to check whether a given string ends with the contents of another string.
“Java Exercises” ends with “se”? false
“Java Exercise” ends with “se”? true*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String c = s.nextLine();
		System.out.println(a+" ends with "+c+"?"+  a.endsWith(c));
		

	}

}
