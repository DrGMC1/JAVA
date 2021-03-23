package week7;

public class passElements {
	
public static void main(String[] args) {
   //integer array
    int[] intArray = {10,20,30,40,50,60,70,80};
     
   //call printArray method by passing intArray as an argument        
   printMyArray(intArray);
 
}
		
//method to print an array, taking array as an argument   
  private static void printMyArray(int[] intArray){
  System.out.println("Array contents printed through method:");
 //print individual elements of array using enhanced for loop
  for(int value: intArray)
  System.out.print(value + " ");
	    }
	

}
