package oops;
/*B43. Create an abstract class ‘Parent’ with a method ‘message’.
 *  It has two subclasses each having a method with the same name ‘message’
 *   that prints ‘This is first subclass’ and ‘This is second subclass’ respectively.
 *    Call the methods ‘message’ by creating an object for each subclass.*/
public abstract class parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c1= new child1();
		c1.message();
		child2 c2 = new child2();
		c2.message();

	}

}
