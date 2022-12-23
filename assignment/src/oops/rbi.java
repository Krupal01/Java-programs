package oops;

public class rbi {

	int interestlimit = 4;
	int minBalance = 100;
	int maxWithdraw = 25000;
	
	public void interest(int interestlimit1) {
		if (interestlimit1>interestlimit) {
			System.out.println("you are allowed");
		}
		else {
			System.out.println("you are not allowed");
		}
	}
	
	public void minbalance(int balance) {
		if (balance>minBalance) {
			System.out.println("you have balance");
		}
		else {
			System.out.println("you have not balance in your account ");
		}
	}
	
	public void maxWithdraw(int withdraw) {
		if (maxWithdraw>withdraw) {
			System.out.println("wiat for money");
		}
		else {
			System.out.println("you are not allowed to withdraw");
		}
	}
	
	
}
