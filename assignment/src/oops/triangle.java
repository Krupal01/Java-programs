package oops;

/*B41. Write a program to print the area and perimeter
 *  of a triangle having sides of 3, 4 and 5 units by
 *   creating a class named ‘Triangle’ without any parameter in its constructor.
*/
public class triangle {
	
	int base= 3;
	int side1=4;
	int side2= 5;
	
	triangle(){
		System.out.println("perameter of triangle is :"+base+" "+side1+" "+side2);
		System.out.println("area of triangle : "+(0.5*base*side1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 triangle s = new triangle();
		 

	}

}
