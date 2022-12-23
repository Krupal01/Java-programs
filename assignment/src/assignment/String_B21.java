package assignment;

import java.util.Scanner;

public class String_B21 {
/*W.A.J.P to check whether a given string starts with the contents of another string.
Red is favorite color. starts with Red? true
Orange is also my favorite color. starts with Red? false */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String c = s.nextLine();
		System.out.println(a+" starts with "+c+"?"+  a.startsWith(c));

	}

}
