package assignment;

public class Array_B12 {
/*B12. W.A.J.P to sum values of an array.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 11, 12, 13, 14, 15, 16};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of value of array: "+ sum);

	}

}
