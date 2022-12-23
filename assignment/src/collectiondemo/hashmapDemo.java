package collectiondemo;

import java.util.HashMap;

public class hashmapDemo {
/*B26. Write a Java program to associate the specified value with the specified key in a HashMap.
 * B27. Write a Java program to count the number of key-value (size) mappings in a map.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "red");
		hm.put(2, "blue");
		hm.put(3, "black");
		hm.put(4, "yellow");
		hm.put(5, "green");
		System.out.println(hm);
		System.out.println("size of map"+hm.size());

	}

}
