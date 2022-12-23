package collectiondemo;

import java.util.ArrayList;

/*I4. Write a Java program of swap two elements in an array list.*/
public class swap_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("red");
		a.add("blue");
		a.add("yellow");
		a.add("green");
		a.add("pink");
		
		System.out.println(a);
		
		int index1 = 2;
		int index2 = 3;
		
		String s = a.get(index1);
		a.add(index1, a.get(index2));
		a.add(index2, s);
		a.remove(index2+2);
		a.remove(index1+2);
		
		System.out.println(a);

	}

}
