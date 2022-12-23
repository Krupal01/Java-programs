package assignment;

import java.util.Arrays;

public class Array_B26 {
/*A3. W.A.J.P to check if the sum of all the 10’s
 *  in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,10,30,15,10,20,15,10};
		int sum=0;
		System.out.println("array is: "+Arrays.toString(a));
		for (int i=0; i<a.length; i++) {
			if (a[i]==10) {
				sum=sum+10;
			}
		}
		if (sum==30) {
			System.out.println("true");
		}
		else {System.out.println("false");}

	}

}
