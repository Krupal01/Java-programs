package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*B13. Write a Java program to create a new array list, add some colors (string) and print out the collection.
 * B14. Write a Java program to iterate through all elements in a array list.
 * B15. Write a Java program to insert an element into the array list at the first position.
 * B16. Write a Java program to retrieve an element (at a specified index) from a given array list.
 * B17. Write a Java program to update specific array element by given element.
 * B18. Write a Java program to remove the third element from a array list.
 * B19. Write a Java program to search an element in a array list.
 * B20. Write a Java program to sort a given array list.
 * B21. Write a Java program to copy one array list into another.
  B22. Write a Java program to shuffle elements in a array list. 

 * 
 * */
public class arraylistDemo {
	public static void main(String[] args) {
		
		ArrayList colors = new ArrayList<String>();
		
		////////////////////////////////////////////
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add("green");
		colors.add("pink");
		System.out.println(colors);
		///////////////////////////////////////////////////////////////////////////////////
		Iterator i1 = colors.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		///////////////////////////////////////////////////////////////////////////////////
		colors.add(0, "black");
		System.out.println(colors);
		/////////////////////////////////////////////////////////////////////////////////
		Scanner s= new Scanner(System.in);
		System.out.println("enter index value");
		int index = s.nextInt();
		String i = (String) colors.get(index);
		System.out.println(i);
		//////////////////////////////////////////////////////////////////////////////////
		System.out.println("enter element to update");
		String u = s.next();
		System.out.println("enter index");
		int index1 = s.nextInt();
		colors.remove(index1);
		colors.add(index1, u);
		////////////////////////////////////////////////////////////////////////////////////
		colors.remove(3);
		System.out.println(colors);
		///////////////////////////////////////////////////////////////////////////////////
		System.out.println("search by index: select 1 or search by element select 2");
		int select = s.nextInt();
		if(select==1) {
			System.out.println("enter index value");
			int index3 = s.nextInt();
			System.out.println("element at index is "+ colors.get(index3));
		}
		else {
			System.out.println("enter element");
			String ele = s.nextLine();
			System.out.println("index of element is "+ colors.indexOf(ele));
		}
		////////////////////////////////////////////////////////////////////////////////////
		Collections.sort(colors);
		///////////////////////////////////////////////////////////////////////////////////
		ArrayList copy = new ArrayList<String>();
		copy.addAll(colors);
		System.out.println(copy);
		///////////////////////////////////////////////////////////////////////////////////
		Collections.shuffle(colors);
		System.out.println("List after shuffling:\n" + colors);
		///////////////////////////////////////////////////////////////////////////////////
		
	}

}
