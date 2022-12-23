package collectiondemo;

import java.util.HashSet;

public class hashset_to_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> a = new HashSet<String>();
		a.add("red");
		a.add("blue");
		a.add("yellow");
		a.add("green");
		a.add("pink");
		
		String S[] = new String[a.size()];
		a.toArray(S);
		
		for(String e:a) {
			System.out.println(e);
		}
			
				

	}

}
