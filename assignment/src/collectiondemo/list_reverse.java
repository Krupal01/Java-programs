package collectiondemo;

import java.util.ArrayList;

public class list_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add("green");
		colors.add("pink");
		System.out.println(colors);
		
		ArrayList reverse = new ArrayList<String>();
		for(int i2=colors.size(); i2>0;i2--) {
			reverse.add(colors.get((i2-1)));
		}
		System.out.println(reverse);

	}

}
