package assignment;

public class B33 {
/*B33. Write a Java program to compute the sum of the first 100 prime numbers.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count,number,i;
		
		for(number=1; number<=100;number++) 
		{
			count=0;
			for(i=2; i<=number/2; i++) 
			{
				if(number%i==0) 
				{
					count++;
					break;
				}
			}
			if(count ==0 && number != 1)
			{
				sum=sum+number;
				
			}
			
		}
		System.out.println("thesum of prime number is "+ sum);

	}

}
