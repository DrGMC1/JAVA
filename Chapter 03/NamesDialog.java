package WeekThree;
import javax.swing.JOptionPane;

/*
   This program demonstrates using dialogs
   with JOptionPane.
*/
 
public class NamesDialog
{
   public static void main(String[] args)
   {
      String firstName, lastName;

      // Get the user's first name.
      firstName = 
         JOptionPane.showInputDialog("What is your first name?");
      
      // Get the user's last name.
      lastName = 
         JOptionPane.showInputDialog("What is your last name?");

      // Display a greeting
      JOptionPane.showMessageDialog(null, "Hello " + firstName + 
                                    " " + lastName);
      /*//This statement causes the program to end, and is required 
       if you use the JOptionPane class
      to display dialog boxes.*/
      System.exit(0);
   }
}