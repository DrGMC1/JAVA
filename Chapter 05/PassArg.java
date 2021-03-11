package WeekSix;
/**
   This program demonstrates a method with a parameter.
*/

public class PassArg
{
   public static void main(String[] args)
   {
      int x = 10;
      //double d = 1.0;

      System.out.println("I am passing values to displayValue.");
      displayValue(5);                       // Pass 5
      displayValue(x);                       // Pass 10
      displayValue(x * 4);                   // Pass 40
      displayValue(Integer.parseInt("700")); // Pass 700
      //displayValue(d);
      System.out.println("Now I am back in main.");
   }
   

/**      The displayValue method displays the value
      of its integer parameter.*/

   public static void displayValue(int num1)
   {
      System.out.println("The value is " + num1);
   }
}
