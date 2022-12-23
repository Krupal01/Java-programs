package oops;

import java.util.Scanner;

public class area extends shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("length : ");
		int length = s.nextInt();
		System.out.println("breadth : ");
		int breadth = s.nextInt();
		System.out.println("side : ");
		int side = s.nextInt();
		System.out.println("radius : ");
		int radius = s.nextInt();
		area r = new area();
		r.RectangleArea(length,breadth);
		r.SquareArea(side);
		r.CircleArea(radius);
		
	}

	@Override
	public void RectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		double area = length*breadth;
		System.out.println("area os rectecgle of : "+ area );
		
	}

	@Override
	public void SquareArea(int side) {
		// TODO Auto-generated method stub
		double area = side*side;
		System.out.println("area os rectecgle of : "+ area );
		
	}

	@Override
	public void CircleArea(int radius) {
		// TODO Auto-generated method stub
		double area = 2*3.14*radius;
		System.out.println("area os rectecgle of : "+ area );
	}

}
