package week7;

public class raggedArrays {

	  public static void main(String[] args) {
	        // declare two dimensional array
	        int[][] elements = { 
	                { 60, 80, 75, 33 }, 
	                { 47, 21, 23, 7, 19, 22, 33, 3, 567 }, 
	                { 66, 91 } 
	                };
	 
	        System.out.println("Length of 2d Array is : " + elements.length); // 3
	        System.out.println("*Size of*");
	        System.out.println("1st row : " + elements[0].length); // 4
	        System.out.println("2nd row : " + elements[1].length); // 5
	        System.out.println("3rd row : " + elements[2].length); // 5
	    }
	
}
