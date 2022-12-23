package collectiondemo;

import java.util.ArrayList;

public class joint_arraylist {

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
		
		a.addAll(b);
		System.out.println(a);

	}

}
