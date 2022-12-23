package exc;

public class insufficient extends Exception {

	int require;
	

	public insufficient(int balance, int i) {
		// TODO Auto-generated constructor stub
		require = i-balance;
	}

	

	public void require(int balance, int i) {
		// TODO Auto-generated method stub
		System.out.println("Account balance is: "+ balance);
		System.out.println("Enter withdraw amount: "+i);
		System.out.println("Sorry, insufficient balance, you need more "+ require + "To perform this transaction.");
	}
	
	

}
