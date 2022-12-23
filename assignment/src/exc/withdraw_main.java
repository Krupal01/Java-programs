package exc;

import java.util.Scanner;
/*A1. W.A.J.P to create a custom exception if Customer withdraw amount which 
 * is greater than account balance then program will show custom 
 * exception otherwise amount will deduct from account balance.
Account balance is:2000
Enter withdraw amount:2500
Sorry, insufficient balance, you need more 500 Rs.
To perform this transaction.*/

public class withdraw_main {
	static int balance = 2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter amount");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		try {
			withdraw(i);
		}
		catch(insufficient e) {
			e.require(balance,i);
		}

	}

	private static void withdraw(int i) throws insufficient{
		// TODO Auto-generated method stub
		if(i<balance) {
			balance-=i;
			System.out.println("your balance is "+balance);
		}
		else {
			throw new insufficient(balance, i);
		}
		
	}

}
