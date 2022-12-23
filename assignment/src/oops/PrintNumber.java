package oops;

/*B35. Create a class named “PrintNumber” to print 
 * various numbers of different datatypes by creating different methods
 *  with the same name “printn” having a parameter for each data type.*/


public class PrintNumber {
	
	public static void printn(String s) {
		System.out.println("string is "+s);
	}
	
	public static void printn(int s) {
		System.out.println("int is "+s);
	}
	
	public static void printn(char s) {
		System.out.println("char is "+s);
	}
	
	public static void printn(float s) {
		System.out.println("float is "+s);
	}
	
	public static void printn(double s) {
		System.out.println("double is "+s);
	}
	
	public static void printn(byte s) {
		System.out.println("byte is "+s);
	}
	
	public static void printn(long s) {
		System.out.println("long is "+s);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		printn(i);
		String s = "krupal";
		printn(s);
		char c = 'd';
		printn(c);
		double d = 2.225;
		printn(d);
		float f = 12;
		printn(f);
		byte b = 8;
		printn(b);
		long l = 1254245;
		printn(l);
		

	}

}
