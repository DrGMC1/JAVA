package Week4;

/**
This program demonstrates the ++ and -- operators
in prefix mode.
*/

public class Prefix
{
public static void main(String[] args)
{
   int number = 4;  // number starts out with 4

   // Display the value in number.
   System.out.println("number is " + number);
   System.out.println("I will increment number.");
   
   // Increment number.
   ++number;
   
   // Display the value in number again.
   System.out.println("Now, number is " + number);
   System.out.println("I will decrement number.");
   
   // Decrement number. Acts on the variable before
   // Assignment takes place
   --number;
   
   // Display the value in number once again.
   System.out.println("Now, number is " + number);
	}
}
