package assignment;
import java.util.Arrays;
import java.util.Scanner; 

public class Array_B14 {
/*B14. W.A.J.P to test if an array contains a specific value.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int a[]= {10,11,12,13,14,15}; 
		   Scanner s = new Scanner(System.in);
		   System.out.println("enter value");
		   int value = s.nextInt();
		   toCheck(a,value);
		
	}

public static void toCheck( int a[], int value) {
	// TODO Auto-generated method stub
	boolean test=false; 
	for(int i=0; i<a.length; i++)
	{
		if(a[i]==value) 
		{
			test = true;
			break;
		}
	}
	 if(test==true) {
		 System.out.println("value is present in array");
	 }
	 else {
		 System.out.println("value is not present in array");
	 }
	
}
		
}


