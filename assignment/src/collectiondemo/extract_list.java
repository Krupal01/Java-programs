package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class extract_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add("green");
		colors.add("pink");
		System.out.println(colors);
		
		List sub_List = colors.subList(0, 3);
		System.out.println("List of first two elements: " + sub_List);

	}

}
