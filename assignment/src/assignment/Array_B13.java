package assignment;

public class Array_B13 {
/*B13. W.A.J.P to calculate the average value of array elements.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 11, 12, 13, 14, 15, 16};
		int sum=0,avg;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		
		avg= sum/a.length;
		System.out.println("average of value of array: "+ avg);

	}

}
