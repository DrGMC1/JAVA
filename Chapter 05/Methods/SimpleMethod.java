package WeekSix;

/**
   This program defines and calls a simple method.
*/

public class SimpleMethod
{
   public static void main(String[] args)
   {
      System.out.println("Hello from the main method.");
      displayMyMessage();
      System.out.println("Back in the main method.");
   }
   
   /**
      The displayMessage method displays a greeting and I want to add more.
   */
   
   public static void displayMyMessage()
   {
      System.out.println("Hello from the displayMyMessage method Here.");
      System.out.println("I want to add more here please");
   }
   	}