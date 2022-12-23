package exc;

import java.util.Scanner;

public class b26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("int1");
		int i = s.nextInt();
		System.out.println("int2");
		int j = s.nextInt();
		try {
			System.out.println(i/j);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}

	}

}
