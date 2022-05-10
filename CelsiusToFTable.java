// C to F using classes
public class CelsiusToFTable {
	public static void main(String[] args) {
		
		int i;
		double celsius1 = 40.0;
		double fahrenheit2 = 120;
		System.out.printf(" Celsius          Fahrenheit     |     Fahrenheit          Celsius\n");
		System.out.printf("_________________________________________________________________\n");
		
		for (i = 0; i < 10; i++) {
			
			System.out.printf(" %.1f             %.1f          |       %.1f              %.1f\n", celsius1, celsiusToFahrenheit(celsius1), fahrenheit2, fahrenheitToCelsius(fahrenheit2));
			celsius1 -= 1.0;
			fahrenheit2 -= 10.0;
		}
	}
	public static double celsiusToFahrenheit (double celsius) {
		
		return (double) (9.0 / 5.0) * celsius + 32;
		
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		return (double) (5.0 / 9.0) * (fahrenheit - 32);
		
	}
}



