package assignment;

public class Array_B16 {
/*B16. W.A.J.P to find the maximum and minimum value of an array.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 11, 12, 13, 14, 15, 16};
		int max=0,min=0;
		for(int i =0; i<a.length; i++)
		{
			if (max>a[i]) {max=a[i];}
			if (min<a[i]) {min=a[i];}
		}
		System.out.println("maximum nuber in array is : "+max);
		System.out.println("minimum nuber in array is : "+min);

	}

}
