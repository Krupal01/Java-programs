package oops;
/*A2. Suppose a class ‘A’ has a static method to
 *  print ‘Parent’. Its subclass ‘B’ also has a 
 *  static method with the same name to print ‘Child’.
 *   Now call this method by the objects of the two classes.
 *    Also, call this method by an object of the parent class
 *     referring to the child class i.e. A obj = new B ()*/

public class a1 {
	public void print() {
		System.out.println("parent");
	}

	public static void main(String[] arg) {
		a1 a = new a1();
		a.print();
		b1 b = new b1();
		b.print();
		a1 obj = new b1();
		obj.print();

	}
}
