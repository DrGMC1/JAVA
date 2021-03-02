package Week4;

public class ContinueExample {
	  public static void main(String[] args) {
	    for (int x = 0; x <= 20; x++) {
	      if (x == 10) {
	        continue;
	      }
	      System.out.println(x);
	    }  
	  }
	}