import java.util.Scanner;

public class max_pallidrom_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String();
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		
		int len = name.length();
		
		for(int i = 0; i<=len/2; i++) {
			System.out.println(name.charAt(i));
		}
		
	}

}
