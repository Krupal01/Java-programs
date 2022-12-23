package oops;
/*B38. Create a class with a method that prints “This is a parent class”
 *  and its subclass with another method that prints “This is child class”.
 *   Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class*/

public class oops38 {
	
	public static void parent() {
		System.out.println("this is a parent class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oops38 o = new oops38();
		o.parent();
		child38 c = new child38();
		c.child();
		c.parent();

	}

}
