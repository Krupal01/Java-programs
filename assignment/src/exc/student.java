package exc;

import java.util.Scanner;

/*W.A.J.P to create a class Student with attributes roll no, name, age and course. 
 * Initialize values through parameterized constructor. If age of student is not 
 * in between 15 and 21 then generate userdefined exception ‘AgeNotWithinRangeException’. 
 * If name contains numbers or special symbols raise exception ‘NameNotValidException’. 
 * Define the two exception classes.*/
public class student {

	static int rollnumber;
	static int age;
	static String name;
	static String course;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter rollnumber : ");
		rollnumber = s.nextInt();
		System.out.println("enter age : ");
		age = s.nextInt();
		System.out.println("enter course : ");
		course = s.next();
		System.out.println("enter name : ");
		name = s.next();
		try {
			valid_student(rollnumber, age,course,name);
		}
		catch(notvalidStudent e) {
			System.out.println("student is not valid due to " + e.toString());
		}
		s.close();

	}

	private static void valid_student(int rollnumber2, int age2, String course2, String name21) throws notvalidStudent{
		// TODO Auto-generated method stub
		if(age<15 || age>21) {
			throw new notvalidStudent(age);
		}
		
	for(int i=0; i<name.length();i++) {
		int j = name.charAt(i);
		if(j<=90 || j>=65 || j<=122 || j>=97) {
			throw new notvalidStudent(name);
		}
	}
		
		
	}

}
