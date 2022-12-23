package oops;

/*B40. Create a class named Rectangle with two data members
 *  length and breadth and two methods to print the area and
 *   perimeter of the rectangle respectively. Its constructor
 *    having parameters for length and breadth is used to initialize
 *     the length and breadth of the rectangle. Let class Square inherit
 *      the Rectangle class with its constructor having a parameter for
 *       its side (suppose s) calling the constructor of its parent class
 *        as ‘super (s, s)’. Print the area and perimeter of a rectangle and a square.*/
public class rectengle {
	
	private int length;
	private int breadth;
	
	rectengle(int length , int breadth){
		this.length = length;
		this.breadth = breadth;
	}
			

	public void area() {
		System.out.println("area : "+(length*breadth));
	}
	
	public void perameter() {
		System.out.println("length is : "+length);
		System.out.println("breadth is : "+breadth);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectengle r = new rectengle(5,6);
		r.area();
		r.perameter();
		
		squre s = new squre(6, 6);
		s.area();
		s.perameter();

	}

}
