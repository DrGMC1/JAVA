package Week10;

public class Temperature {

public static double convertFahrenheitToCelsius(double degreesF)
{  
	return 5.0/9.0 * (degreesF - 32);
}

public static double convertFahrenheitToKelvin(double degreesF)
{  
	return (degreesF + 459.67) * (5.0/9.0);
}


public static void main(String[] args)
{  
	double degreesF = 45.3;

		// since we have 2 static methods, no instances
		// of the TemperatureConverter class are required  
		System.out.printf("%f degrees Fahrenheit%n", degreesF);  
		System.out.printf("is %f Celsius%n",Temperature.convertFahrenheitToCelsius(degreesF));
		System.out.printf("is %f Kelvin%n", Temperature.convertFahrenheitToCelsius(degreesF));
	}
}
