package assignment;

public class String_B26 {
/*W.A.J.P to count and print all the duplicates in the input string.
The given string is: w3resource tops technologies
The duplicate characters and counts are: t appears 2 times o appears 3 times so on…………. */
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "tops technologies";
		
		for (int i=0; i<a.length(); i++) {
			int count = 0;
			for (int j=0; j<a.length(); j++) {
				
				if(a.charAt(i)==a.charAt(j)) {
					count+=1;
					System.out.println(a.charAt(i)+" appears "+count+" times.");
				}
				
			}
		}

	}

}*/
/*import java.util.*; 
public class Main 
{*/
    static final int MAX_CHARS = 256;
    static void CountCharacters(String str1, int[] ctr)
    {
       for (int i = 0; i < str1.length();  i++)
          ctr[str1.charAt(i)]++;
    }
    static void showDuplicates(String str1)
    {
      int ctr[] = new int[MAX_CHARS];
      CountCharacters(str1, ctr);
      for (int i = 0; i < MAX_CHARS; i++)
        if(ctr[i] > 1)
            System.out.printf("%c  appears  %d  times\n", i,  ctr[i]);
    }
    public static void main(String[] args)
    {
        String str1 = "w3resource";
		System.out.println("The given string is: "+str1);
		System.out.println("The duplicate characters and counts are: ");
        showDuplicates(str1);
    }
}


