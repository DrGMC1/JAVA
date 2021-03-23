package week7;

/**
This program shows an array being initialized.
*/

public class ArrayInitialization
{
public static void main(String[] args)
{
   int[] days = { 31, 28, 31, 30, 31, 30,
                  31, 31, 30, 31, 30, 31 };

   for (int index = 0; index < 12; index++)
   {
      System.out.println("Month " + (index + 1) +
                         " has " + days[index] +
                         " days.");
   }
 }
}


/*sets a variable before the loop starts (int i = 0).
defines the condition for the loop to run (i must be less than 12). If the condition is true, the loop will start over again, if it is false, the loop will end.
3 increases a value (i++) each time the code block in the loop has been executed.*/