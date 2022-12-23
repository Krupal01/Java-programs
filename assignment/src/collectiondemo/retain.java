package collectiondemo;

import java.util.HashSet;

/*Write a Java program to compare two sets and retain elements which are same on both sets.*/
public class retain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> result = new HashSet<>();
		//////////////////////////////////////////////////////////////////////
		hs.add("k");
		hs.add("r");
		hs.add("u");
		hs.add("p");
		hs.add("a");
		hs.add("l");
		hs.add("10");
		hs.add("10");
		hs1.add("k");
		hs1.add("r");
		hs1.add("u");
		hs1.add("p");
		hs1.add("a");
		hs1.add("l");
		
		hs.retainAll(hs1);
		System.out.println(hs);
	

	}

}
