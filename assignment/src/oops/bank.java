package oops;
/*B44. Create an abstract class ‘Bank’ with an abstract method ‘getBalance’.
 * $100, $150 and $200 are deposited in banks A, B and C respectively.
 *‘BankA’, ‘BankB’ and ‘BankC’ are subclasses of class ‘Bank’, each having a method named ‘getBalance’.
 * Call this method by creating an object of each of the three classes.*/
public abstract class bank {
	
	public abstract void getBalance(int b);
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankA a = new bankA();
		bankB b = new bankB();
		bankC c = new bankC();
		a.getBalance(100);
		b.getBalance(150);
		c.getBalance(200);

	}

}
