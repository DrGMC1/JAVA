package Week10;

/**
 * This class Composing the Date Class with the Person Class.
 */
public class Info
{
   private Person name;
   private Date   dob;

   /**
    * This constructor accepts arguments for the
    * firstname, lastname, date, month, and year.
    */
   public Info(String firstname, String lastname, int month, int day,
               int year)
   {
      name = new Person(firstname, lastname);
      dob  = new Date(month, day, year);
   }

   /**
    * The set method sets each field.
    */
   public void setInfo(String firstname, String lastname, int month,
                       int day, int year)
   {
      name.setName(firstname, lastname);
      dob.setDate(month, day, year);
   }

   /**
    * The toString method returns a string containing
    * the information.
    */
   public String toString()
   {
      String str = "Name : " + name + "\nDate of Birth : " + dob;

      return str;
   }
}