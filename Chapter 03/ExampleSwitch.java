package WeekThree;

public class ExampleSwitch {
	  public static void main(String[] args) {
	    int month = 10;
	 
	    switch (month) {
	      case 1:
	        System.out.println("january");
	        break;
	      case 2:
	        System.out.println("feb");
	        break;
	      case 3:
	        System.out.println("march");
	        break;
	      case 4:
	        System.out.println("april");
	       break;
	      case 5:
	        System.out.println("may");
	       break;
	      case 6:
	        System.out.println("june");
	       break;
	      case 7:
	        System.out.println("more and more here :-)");
	        break;
	        
	      default:
	            System.out.println("No months here at all!");
	    }
	  }
	}