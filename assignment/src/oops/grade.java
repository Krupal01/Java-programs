package oops;

import java.util.Scanner;

/*I3. Write a program which will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below:
Marks Grade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail
*/
public class grade {

	public static void grade(int i){
		if(i>=91) {
			System.out.println("your grade is AA");
			
		}
		
		else if(i>=81) {
			System.out.println("your grade is AB");
		}
		else if(i>=71) {
			System.out.println("your grade is BB");
		}
		else if(i>=61) {
			System.out.println("your grade is BC");
		}
		else if(i>=51) {
			System.out.println("your grade is CD");
		}
		else if(i>=41) {
			System.out.println("your grade is DD");
		}
		else if(i<=40) {
			System.out.println("your are fail");
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter your marks : ");
		int marks = s.nextInt();
		grade(marks);
		
		

	}

}
