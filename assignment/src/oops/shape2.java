package oops;
/*I4. Create a class named ‘Shape’ with a method
 *  to print ‘This is This is shape’. Then create
 *   two other classes named ‘Rectangle’, ‘Circle’
 *    inheriting the Shape class, both having a method
 *     to print ‘This is rectangular shape’ and ‘This is
 *      circular shape’ respectively. Create a subclass 
 *      ‘Square’ of ‘Rectangle’ having a method to print 
 *      ‘Square is a rectangle’. Now call the method of ‘Shape’ 
 *      and ‘Rectangle’ class by the object of ‘Square’ class.*/
public class shape2 {
	
	public void shape() {
		System.out.println("this is shape");
	}
	
	public static void main(String[] args) {
		squre2 s = new squre2();
		s.shape();
		s.rectengle();
		
	}
}
