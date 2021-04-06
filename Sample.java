package Week10;

/**
 * This program demonstrates how a method can return
 * a reference to an object.
 */
public class Sample
{
   private int value;

   public Sample(int i)
   {
      value = i;
   }

   /**
    * The makeTwice method returns a Sample object
    * containing the value twice the passed to it.
    */
   public Sample makeTwice()
   {
      Sample temp = new Sample(value * 2);

      return temp;
   }

   public void show()
   {
      System.out.println("Here is my value : " + value);
   }
}

