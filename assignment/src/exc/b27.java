package exc;

import java.util.Scanner;

public class b27 {

	   public static void main (String args[]) {
		      int array[] = {20,20,40};
		      Scanner s = new Scanner(System.in);
		      System.out.println("int1");
		      int num1 = s.nextInt();
		      System.out.println("int2");
		      int num2 = s.nextInt();
		      int result;
		      try {
		         result = num1/num2;
		         System.out.println("The result is" +result);
		         for(int i = 5; i >= 0; i--) {
		            System.out.println("The value of array is" +array[i]);
		         }
		      } catch (ArrayIndexOutOfBoundsException e) {
		         System.out.println("Array is out of Bounds"+e);
		      } catch (ArithmeticException e) {
		         System.out.println ("Can't divide by Zero"+e);
		      }
		   }


}
