package week7;

/**
This program uses an invalid subscript with an array.
*/

public class offByOne
{
public static void main(String[] args)
{
	int[] numbers = new int[10];

   System.out.println("I will attempt to store four " +
                      "numbers in a three-element array.");

   for (int i = 1; i <= 10; i++)

   {
      System.out.println("Now processing element " + numbers);
      numbers[i] = 9;
   }
  }
}


/*printing out an array doesn't (by default) produce any meaningful output. 
Typically, you would use a for-loop 
to loop through and print-out each element of the array.*/