package assignment;

public class Array_B24 {
/*A1. W.A.J.P to find the common elements between two arrays (string values).*/ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,11,12,13,14,15};
		int b[]= {5,6,7,8,9,11,12,10,10};
		System.out.println("comman element is : ");
		for(int i =0; i<a.length; i++) {
			for (int j=0; j<b.length; j++) {
				if (a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
