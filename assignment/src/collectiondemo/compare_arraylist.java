package collectiondemo;

import java.util.ArrayList;
/*I3. Write a Java program to compare two array lists.*/
public class compare_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> a = new ArrayList<>();
		ArrayList<Object> b = new ArrayList<>();
		
		a.add("red");
		a.add("blue");
		a.add("yellow");
		a.add("green");
		a.add("pink");
		
		b.add("red");
		b.add("blue");
		b.add("black");
		b.add("green");
		b.add("yellow");
		
		ArrayList<Object> result = new ArrayList<>();
		
		for(int i = 0; i<a.size(); i++) {
		if(a.get(i).equals(b.get(i))) {
			result.add(b.get(i));
		}
		else {
			result.add("not match");
		}
		
		}
		System.out.println(result);
		
}
}