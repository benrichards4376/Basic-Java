import java.util.Scanner;

// Given temperature and wind speed, determine and display the wind chill index
public class WindChillIndex {
	public static void main(String[] args) {
		
		// Allow for inputs to be received
		Scanner input = new Scanner(System.in);
		
		// Create variables to store temperature, wind speed, and wind chill index
		double outTemp, windSpeed, windChill;
		
		// Prompt the user to enter the temperature within a valid range
		System.out.println("Enter the temperature in Fahrenheit between -58 F and 41 F:");
		
		// Store in variable 'outTemp'
		outTemp = input.nextDouble();
		
		// Prompt the user to enter the wind speed
		System.out.println("Enter the wind speed (>=2) in miles per hour:");
		
		// Store in varaible 'windSpeed'
		windSpeed = input.nextDouble();
		
		// Store the exponent function in windSpeed to make following function easily readable
		windSpeed = Math.pow(windSpeed, .16);
		
		// Use the given formula to determine the wind chill index
		windChill = 35.74 + (.6215 * outTemp) - (35.75 * windSpeed) + (.4275 * outTemp * windSpeed);
		
		// Display the wind chill index
		System.out.println("The wind chill index is " + windChill".\n");
	}
}