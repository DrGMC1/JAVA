package WeekSix;

/**
   This program demonstrates that two methods may have
   local variables with the same name.
*/

public class LocalVars
{
   public static void main(String[] args)
   {
      texas();
      california();
   }
   
   /**
      The texas method has a local variable named tax.
   */
   
   public static void texas()
   {
      int tax = 8;
      
      System.out.println("In texas there are " +
    		  tax + "% sales tax.");
   }
   
   /**
      The california method also has a local variable named tax.
   */
   public static void california()
   {
      int tax = 9;

      System.out.println("In california there are " +
    		  tax + "% sales tax.");
   }
}
