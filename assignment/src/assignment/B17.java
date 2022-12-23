package assignment;
import java.util.Scanner;

public class B17 {
/*B17. Write a Java program that takes the user to
 *  provide a single character from the alphabet. Print Vowel 
 *  or Consonant, depending on the user input. If the user input is not
 *  a letter (between a and z or A and Z), or is a string of length > 1, print an error message.*/
	public static void main(String[] args) {
	
			String s ;	
			System.out.println("enter one character :");
			Scanner i = new Scanner(System.in);
			s=i.nextLine();
			
			if(s.length()>1) {
				System.out.println("error : enter only one character");
			}
			else {
				char j = s.charAt(0);
				if(j=='A'||j=='a'||j=='E'||j=='e'||j=='I'||j=='i'||j=='O'||j=='o'||j=='U'||j=='u') {
					System.out.println(" the character is vowel");
				}
				else {
					System.out.println("the character is Consonant");
				}
			}
			
			i.close();

		// TODO Auto-generated method stub

	}

}
