package collectiondemo;

import java.util.HashMap;

public class check_empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "red");
		hm.put(2, "blue");
		hm.put(3, "black");
		hm.put(4, "yellow");
		hm.put(5, "green");
		
		System.out.println("hashmap is empty : "+hm.isEmpty());
		

	}

}
