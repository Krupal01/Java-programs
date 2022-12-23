package oops;

import java.util.Scanner;

public class PNB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter balance");
		int balance = s.nextInt();
		System.out.println("enter withdraw amount");
		int withdraw = s.nextInt();
		System.out.println("enter interst rate");
		int interest= s.nextInt();
		
		rbi a = new rbi();
		a.interest(interest);
		a.maxWithdraw(withdraw);
		a.minbalance(balance);
	}

}
