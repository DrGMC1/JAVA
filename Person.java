package Week10;

/**
 * This class stores information about a Person.
 */
public class Person
{
   private String firstname, lastname;

   /**
    * This constructor accepts arguments for the
    * first name, and first name.
    */
   public Person(String firstname, String lastname)
   {
      this.firstname = firstname;
      this.lastname  = lastname;
   }

  
    //The set method sets each field.
    
   public void setName(String firstname, String lastname)
   {
      this.firstname = firstname;
      this.lastname  = lastname;
   }

   /**
    * The toString method returns a string containing
    * the Person information.
    */
   public String toString()
   {
      return firstname + " " + lastname;
   }
}