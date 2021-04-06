package Week10;

/**
 * This program passes an object as an argument.
 * The object is modified by the receiving method.
 */
public class PassObjectDemo
{
   public static void main(String[] args)
   {
      // Create an Rectangle object.
      Rectangle rect = new Rectangle(10, 20);

      // Display the object's contents.
      System.out.println("Length : " + rect.getLength());
      System.out.println("Width: " + rect.getWidth());
      System.out.println("Area: " + rect.getArea());

      // Pass the object to the ChangeRectangle method.
      changeRectangle(rect);

      // Display the object's contents again.
      System.out.println();
      System.out.println("Length : " + rect.getLength());
      System.out.println("Width: " + rect.getWidth());
      System.out.println("Area: " + rect.getArea());
   }

   /**
    * The following method accepts a Rectangle
    * object as an argument and changes its contents.
    */
   public static void changeRectangle(Rectangle myNewRectangle)
   {
	   myNewRectangle.set(12, 5);
   }
}