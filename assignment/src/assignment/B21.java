package assignment;

public class B21 {
/*B21. Write a program in Java to display the pattern like right angle triangle with a number.
1
12
123
1234
12345
123456
1234567
12345678  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
