package collectiondemo;

import java.util.ArrayList;
import java.util.Scanner;
/*Write a Java program to replace the second element of a ArrayList with the specified element.*/
public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("red");
		a.add("blue");
		a.add("yellow");
		a.add("green");
		a.add("pink");
		
		System.out.println(a);
		
		int index = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element");
		String s = sc.nextLine();
		
		a.add(index, s);
		a.remove(index+1);
		
		
		System.out.println(a);

	}

}
