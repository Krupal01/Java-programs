package exc;

import java.util.Scanner;
/*W.A.J.P to read 10 integer values using Scanner class
 *  from keyboard. Generate the exception if the entered value
 *   is less than 10 and or greater than 40. Program should display 
 *   appropriate message as and when this exception occurs otherwise 
 *   it will display all the entered values.*/
public class i1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[]= new int [5];
		for(int i=0;i<5;i++) {
			System.out.println("enter "+i);
			a[i]=s.nextInt();
			try {
				valid(a[i]);
			}
			catch(notvalid e){
				System.out.println(e.notvalid());
			}
		}
	}

	public static void valid(int i) throws notvalid {
		// TODO Auto-generated method stub
		if(i>10 && i<40) {
			System.out.println(i);
		}
		else {
			throw new notvalid(i);
		}
	}

}
