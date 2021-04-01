package WeekNine;
//Java program to demonstrate working of method
//overloading in Java.

public class SumOverload {

	// Overloaded sum(). This sum takes two int parameters
	public int sum(int x, int y)
	{
		return (x + y);
	}

	// Overloaded sum(). This sum takes three int parameters
	public int sum(int x, int y, int z)
	{
		return (x + y + z);
	}

	// Overloaded sum(). This sum takes two double parameters
	public double sum(double x, double y)
	{
		return (x + y);
	}

	// Main Driver code
	public static void main(String args[])
	{
		SumOverload s = new SumOverload();
		System.out.println(s.sum(100, 200));
		System.out.println(s.sum(100, 200, 300));
		System.out.println(s.sum(200.5, 380.5));
	}
}
