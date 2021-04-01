package WeekNine;

class ObjectPassDemo
{
	int a, b;

	//copy of the original reference as placeholder
	ObjectPassDemo(int x, int x1) 
	{
		a = x;
		b = x1;
	}

	// return true if X is equal to the invoking
	// object notice an object is passed as an
	// argument to method
	boolean equalTo(ObjectPassDemo x)
	{
		return (x.a == a && x.b == b);
	}
}

// Main class
public class TestPassingObj
{
	public static void main(String args[])
	{
		//2 objects are created here 
		ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
		ObjectPassDemo ob2 = new ObjectPassDemo(200, 66);

		System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
	}
}
