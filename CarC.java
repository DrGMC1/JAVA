package WeekNine;

public class CarC {
	
	public String color;   /* declare fields inside the class by specifying the type and name */
	public boolean isRunning;
	public int velocity;
	public String type; 
	
	public CarC(String carColor, boolean CarRunning, int MilesPerHrs, String truck )  // constructor method with a parameter
	
	{
		color = carColor; //parameter value assigned to the field
		isRunning = CarRunning;
		velocity = MilesPerHrs;
		type = truck;	
	}
		
	public static void main(String [] args) // the main method and some program task 
	{
		CarC ford = new CarC ("red", true, 89, "truck"); // this is how we create objects in java
		CarC nissan= new CarC("blue", false, 100, "sedan");
		
		/*  invoke a constructor using 
	    'new', the name, and parentheses: new Car()*/
		//use the keyword new to indicate that we’re creating an instance.
		
		
		System.out.println(ford.color); //the object ford holds the state of color as an instance field referencing the value color
		System.out.println(ford.isRunning);
		System.out.println(ford.velocity);
		System.out.println(ford.type);
		System.out.println();
		System.out.println(nissan.color);
		System.out.println(nissan.isRunning);
		System.out.println(nissan.velocity);
		System.out.println(nissan.type);
	}
}
	
	
