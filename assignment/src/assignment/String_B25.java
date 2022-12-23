package assignment;

public class String_B25 {
/*A2.
W.A.J.P to divide a string in an equal part.
The given string is: abcdefghijklmnopqrstuvwxy
The string divided into 5 parts and they are:
abcde
fghij
klmno
pqrst
uvwxy*/
	
		 public static void main(String[] args) {
			 String a = "abcdefghijklmnopqrstuvwxy";
			double d = Math.sqrt(a.length());
			int size = (int) d;
			System.out.println(size);
			if(a.length()%size==0)
			{
				for(int i=0; i<a.length(); i++ ) 
				{
					if(i%size==0)
					{
						System.out.println();
					}
					
					 System.out.print(a.charAt(i));
				}
			}
			else {
				System.out.println(" it is not possiblr to do equal parts of string");
				}
			}
}


