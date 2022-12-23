package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;

/*B23. Write a Java program to append the specified element to the end of a hash set.
 * B24. Write a Java program to iterate through all elements in a hash list.
 * B25. Write a Java program to get the number of elements in a hash set.
 * 
 * */
public class hashsetdemo {
	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		//////////////////////////////////////////////////////////////////////
		hs.add("k");
		hs.add("r");
		hs.add("u");
		hs.add("p");
		hs.add("a");
		hs.add("l");
		hs.add("10");
		hs.add("10");
		System.out.println(hs);
		////////////////////////////////////////////////////////////////////////
		Iterator<String> p = hs.iterator();
		   while (p.hasNext()) {
		   System.out.println(p.next());
		   }
		/////////////////////////////////////////////////////////////////////////
		System.out.println("total element ofset is "+hs.size());
		////////////////////////////////////////////////////////////////////////
		
	}
	
}
