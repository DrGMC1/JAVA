public class Student {
	public String name ; 
	public int studentID = 0 ;
	public int age = 0;
	public boolean scholarship = false;
	public String level = "undefined";
	 
	//create a method is not going to take any valuer or return any and access the properties of this class	
	public void introduce()
	{ 
	  System.out.println("my name is "+ name);
	  System.out.println("my studentID is "+ studentID);
	  System.out.println("my age is "+ age);
	  System.out.println("scholarship? "+ scholarship);
	  System.out.println("Level? "+ level);
	  System.out.println();
	 }
	 
	//Create method here for the scholarship. Method type and method name
	public boolean hasScholarship()
	{ 
	  return false; //return value
	}
}
	
