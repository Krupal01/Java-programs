package assignment;

public class B24 {
/*B24. Write a Java program to display Pascal’s triangle.
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		for(int i=1; i<=5; i++) {
			t=1;
			for(int j=1; j<=i; j++) {
				System.out.print(t);
				t=t*(i-j)/j;
				
			}
			System.out.println("");
		}


	}

}
