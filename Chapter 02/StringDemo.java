package WeekTwo;

//A simple program demonstrating String objects.

/*
 * HEllo
 * hello
 */

/*
 * 
 */
public class StringDemo
{
public static void main(String[] args)
  {
   String greeting = "What a beautiful morning, ";
   String name1 = "ITS 275 Class";

   System.out.println(greeting + name1);
   System.out.println();
   
   // String methods
   String name = "Gilbert Munoz-Cornejo";
   int stringSize1;

   stringSize1 = name.length();
   System.out.println(name + " has " + stringSize1 +
                      " characters.");
   System.out.println("");
   
   // String methods Examples from TextBook
   String message = "Java is Great Fun!";
   String upper = message.toUpperCase();
   String lower = message.toLowerCase();
   char letter = message.charAt(0);
   int stringSize = message.length();

   System.out.println(message);
   System.out.println(upper);
   System.out.println(lower);
   System.out.println(letter);
   System.out.println(stringSize);
   
  }
}