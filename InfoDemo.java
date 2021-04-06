package Week10;

/**
 * This program demonstrates the Info class.
 */
public class InfoDemo
{
   public static void main(String[] args)
   {
      // Create an Info object.
      Info author0 = new Info("Robin", "Smith", 10, 3, 1984);
      Info author1 = new Info("Batman", "Miller", 11, 13, 1974);
      

      // Display the course information.
      System.out.println(author0);
      System.out.println();
      System.out.println(author1);
   }
}