package assignment;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int i = 251,R = 0 , j;
		  
          while (i > 0) {
                       j = i % 10;
                       i = i / 10;
                       R = R * 10 + j;
                   }
          System.out.println(R);
              
	}

}
