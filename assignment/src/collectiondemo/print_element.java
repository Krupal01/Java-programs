package collectiondemo;

import java.util.ArrayList;

public class print_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("red");
		a.add("blue");
		a.add("yellow");
		a.add("green");
		a.add("pink");
		
		for(int i=0; i<a.size(); i++) {
			System.out.println("element at "+(i+1)+" is "+a.get(i));
		}
	}

}
