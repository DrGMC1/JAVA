package Week10;

/**
 * This class stores information about a Date.
 */
public class Date
{
   private int month, day, year;

   /**
    * This constructor accepts arguments for the
    * date, month, and year.
    */
   public Date(int month, int day, int year)
   {
      this.month = month;
      this.day   = day;
      this.year  = year;
   }

   /**
    * The set method sets each field.
    */
   public void setDate(int month, int day, int year)
   {
      this.month = month;
      this.day   = day;
      this.year  = year;
   }

   /**
    * The toString method returns a string containing
    * the date information.
    */
   public String toString()
   {
      return month + "-" + day + "-" + year;
   }
}