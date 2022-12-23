package oops;
/*B37. Create a class to print the area of a square and a rectangle.
 *  The class has two methods with the same name but different number of parameters. 
 *  The method for printing area of a rectangle has two parameters which are length and 
 *  breadth respectively while the other method for printing area of square has one parameter 
 *  which is side of square.*/
public class oops37 {
	
	public static void squre(int length) {
		System.out.println("area of squre : "+ (length*length));
	}
	
	public static void rectegular(int length , int width) {
		System.out.println("area of rectegular : "+ (length*width));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		int width = 6;
		squre(length);
		rectegular(length,width);

	}

}
