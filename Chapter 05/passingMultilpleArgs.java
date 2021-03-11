package WeekSix;

public class passingMultilpleArgs {

  public static void main(String[] args) {
	 
    System.out.println("I am passing values to show the sum.");
    showSum (10.3,5.6);
  }
	
 public static void showSum(double num1, double num2) {
   double sum = num1 + num2;
  System.out.println("The final sum is " + sum);
  
  } 

}
