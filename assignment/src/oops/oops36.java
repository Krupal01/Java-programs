package oops;
/*B36. Create a class to print an integer and a character
 *  with two methods having the same name but different 
 *  sequence of the integer and the character parameters.*/

public class oops36 {
	
	public static void printn(int i , char c) {
		System.out.println("integer "+i+" character "+c);
	}
	
	public static void printn(char c , int i) {
		System.out.println("character "+c+" integer "+i);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 6;
		char c = 'd';
		printn(i,c);
		printn(c,i);

	}

}
