package Week10;

public class ReturnObjectDemo
{
   public static void main(String[] args)
   {
      Sample obj1 = new Sample(10);
      Sample obj2;

      // The makeTwice method returns a reference
      obj2 = obj1.makeTwice();
      obj2.show();
   }
}