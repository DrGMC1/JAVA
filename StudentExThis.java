package Week10;

public class StudentExThis  {
  	
	String name;
	int age ; //instant variable
	double GPA;
	
	StudentExThis(String name, int age, double GPA) { //take couple parameters as the instance variables 
		this.name = name;
		this.age = age; //this refers to the first instance variable and age to the local variable
		this.GPA = GPA;
		System.out.println( "My name is " + name + " and my age is " + age 
				+ " and his GPS is:" + GPA);
		
	}
}