package week7;

public class returnArray {

	public static void main(String args[]) {
	      //call method return_array that returns array   
		double[] values;
	    values = getArray(); //here assigns the array returned by the getarray method to the array variable values
	    for (double num : values)
	    System.out.print(num + "  ");
	    }	
	
	public static double[] getArray() {
	       //define string array
			double[] array = { 1.2, 2.3, 4.5, 6.7, 8.9 };

	      //return string array
	      return array;
	   }
}
