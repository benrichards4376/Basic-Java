import java.util.Scanner;

// Convert a feet measurement to meters
public class FeetToMeters {
	public static void main(String[] args) {
		
		// Allow for scanned inputs from user
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the feet value to be converted
		System.out.println("Enter a value for feet:");
		
		// Receive an input from user and assign it to 'feet'
		double feet = input.nextDouble();
		
		// Convert feet to meters by using standard conversion rate and assign it to 'meters'
		double meters = feet * .305;
		
		// Display the number of feet inputted and what it converts to in meters
		System.out.println(+ feet + " feet is " + meters + " meters.\n");
	}
}