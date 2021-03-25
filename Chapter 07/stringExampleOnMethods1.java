package week7;
import java.util.Arrays;
/**
This program demonstrates methods on array elements
*/

public class stringExampleOnMethods1{
	
public static void main(String[] args)
{
	final int SIZE = 4;
	String[] names = new String [SIZE];
	names[0] = "Bill";
	names[1] = "Susan";
	names[2] = "Steven";
	names[3] = "Jean";
	
	//Uppercase--> method
	  System.out.println(names[0].toUpperCase());
	  System.out.println(names[1].toUpperCase());
	  System.out.println(names[2].toUpperCase());
	  System.out.println(names[3].toUpperCase());
	  
	  System.out.println();
	  
	 //CharAt--> single character at a specified location
	  char letter = names[3].charAt(0);
	   System.out.print(letter);
	      
	   System.out.println();
	     
	   
	   
	   
	   
   		}
	}	

