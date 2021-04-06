package Week10;

/**
This program demonstrates the Countable class.
*/

public class StaticDemo
{
public static void main(String[] args)
{
   int objectCount;
  
    // Create three instances of the 
   // Countable class.
   Countable object1 = new Countable();
   Countable object2 = new Countable();
   Countable object3 = new Countable();

   // Get the number of instances from
   // the class's static field.
   objectCount = object1.getInstanceCount();
   System.out.println(objectCount + 
                 " instances of the class " +
                 "were created.");
}
}



/*In line 20 the program calls the getInstanceCount method to retrieve the number of
instances that have been created:
objectCount = object1.getInstanceCount();
Although the program calls the getInstanceCount method from object1, the same value
would be returned from any of the objects.*/