package exc;

import java.util.Scanner;
/*W.A.J.P to create the validate method that takes integer 
 * value as a parameter. If the age is less than 18, then 
 * throw an ArithmeticException otherwise print a message welcome to vote.
O/P- Enter your age :16
Exception in thread main java. lang. ArithmeticException: not valid*/
public class i2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		try {
		validate(age);
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
	}

	private static void validate(int age) throws ArithmeticException {
		// TODO Auto-generated method stub
		if(age>18) {
			System.out.println("welcome to vote");
		}
		else {
			throw new ArithmeticException("not valid");
		}
		
	}

}
