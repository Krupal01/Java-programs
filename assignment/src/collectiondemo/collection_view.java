package collectiondemo;

import java.util.HashMap;
import java.util.HashSet;
/*Write a Java program to get a collection view of the values contained in this map.*/
public class collection_view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer , String> hs = new HashMap<Integer , String>();
		 hs.put(1,"Red");
		  hs.put(2,"Green");
		  hs.put(3,"Black");
		  hs.put(4,"White");
		  hs.put(5,"Blue");
		  System.out.println(hs.values());

	}

}
