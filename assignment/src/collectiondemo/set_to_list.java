package collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;

public class set_to_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> a = new HashSet<String>();
		a.add("red");
		a.add("blue");
		a.add("yellow");
		a.add("green");
		a.add("pink");
		
		ArrayList<String> b = new ArrayList<String>();
		b.addAll(a);
		System.out.println(b);

	}

}
