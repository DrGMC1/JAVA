package week7;
import java.util.Arrays;
/**
This program demonstrates methods on array elements
*/

public class stringExampleOnMethods2{
	
public static void main(String[] args)
{
	 String[] s1 = { "Adam", "Ben", "Carl" };
     String[] s2 = { "Zulu", "Yankee", "Victor" };

     
     //equals method
     if (Arrays.equals(s1, s2))
         System.out.println("Both arrays are equal");
     else
         System.out.println("Both arrays are not equal");
     
		}
}	

