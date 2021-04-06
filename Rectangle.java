package Week10;

public class Rectangle
{
   private double length;
   private double width;

   public Rectangle()
   {
      length = 0.0;
      width  = 0.0;
   }

   public Rectangle(double l, double w)
   {
      length = l;
      width  = w;
   }

   public void setLength(double l)
   {
      length = l;
   }

   public void setWidth(double w)
   {
      width = w;
   }

   public void set(double l, double w)
   {
      length = l;
      width  = w;
   }

   public double getLength()
   {
      return length;
   }

   public double getWidth()
   {
      return width;
   }

   public double getArea()
   {
      return length * width;
   }

   public double getPerimeter()
   {
      return 2 * (length + width);
   }
}