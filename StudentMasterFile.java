package WeekNine;

public class StudentMasterFile {
	public static void main(String[] args) {
		// THIS IS HOW WE CAN CREATE OBJECTS IN JAVA
		  Student Andy = new Student(); 
		  Andy.name = "Andy Smith";
		  Andy.studentID = 1234;
		  Andy.age = 20;
		  Andy.scholarship = true;
		  Andy.level = "Senior";
		  Andy.Gender = 'M';
		  Andy.introduce();
		   
		// Introducing another object another student in this case
		  Student Rose = new Student();
		  Rose.name = "Rose Gomez";
		  Rose.introduce();
		  
		  
		  Student Abe = new Student();
		  Abe.introduce();
		  
		}
	 }