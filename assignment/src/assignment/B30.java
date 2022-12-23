package assignment;

public class B30 {
/*B30. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i<=100) {
			
			if((i%3)==0 || (i%5==0)) {
				System.out.println(i);
			}
			
			i++;
		}

	}

}
