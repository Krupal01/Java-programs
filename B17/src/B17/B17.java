package B17;

import java.util.Scanner;

public class B17 {


	public static void main() {
	String j ;	
	System.out.println("enter one character :");
	Scanner i = new Scanner(System.in);
	j=i.nextLine();
	
	if(j.length()>1) {
		System.out.println("error : enter only one character");
	}
	else {
		if(j=="A"||j=="a"||j=="E"||j=="e"||j=="I"||j=="i"||j=="O"||j=="o"||j=="U"||j=="u") {
			System.out.println("vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}
	
	i.close();
	}
}
