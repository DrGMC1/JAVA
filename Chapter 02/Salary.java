/**
 * 
 */
package WeekTwo;

/**
 * @author gmae3
 *
 */
//This program calculates hourly wages plus overtime.

public class Salary
{
public static void main(String[] args)      
{
   double regularSalary;       // The calculated regular wages.
   double basePay = 25;       // The base pay rate. 
   double regularHours = 40;  // The hours worked less overtime.
   double overtimeSalary;      // Overtime wages
   double overtimePay = 37.5; // Overtime pay rate
   double overtimeHours = 10; // Overtime hours worked
   double totalSalary;         // Total wages

   regularSalary = basePay * regularHours; 
   overtimeSalary = overtimePay * overtimeHours;
   totalSalary = regularSalary + overtimeSalary;
   
   
   System.out.println("Salary for this week are $" +
                      totalSalary);
  
   double number = 1/2.0;			// Integer division. Fix change the data type
      System.out.println(number);
   
	}
}  
