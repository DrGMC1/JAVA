package week7;

/**
This program uses an invalid subscript with an array.
*/

public class InvalidSubscript
{
public static void main(String[] args)
{
   int[] myValues = new int[3];

   System.out.println("I will attempt to store four " +
                      "numbers in a three-element array.");

   for (int index = 0; index < 4; index++)
   {
      System.out.println("Now processing element " + index);
       myValues[index] = 4;
   }
  }
}








/*declares a three-element array, but attempts to
store four values in the array.*/