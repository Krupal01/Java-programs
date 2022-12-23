package assignment;

import java.util.Scanner;

public class String_B17 {
/*W.A.J.P to get the character at the given index within the String.
Original String = Tops Technologies!
The character at position 0 is T
The character at position 10 is o*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Tops Technologies!";
		Scanner i = new Scanner (System.in);
		System.out.println("enter index");
		int index= i.nextInt();
		System.out.println("character atgiven index is : "+ a.charAt(index));

	}

}
