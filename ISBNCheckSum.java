import java.util.Scanner;

// Store an ISBN number from user input and calculate a checksum for the tenth value
public class ISBNCheckSum {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Create variables to store each digit of the ISBN
		int number, digit1, digit2, digit3, digit4, digit5, digit6, digit7, digit8, digit9, checksum;

		System.out.printf("Enter the first 9 digits of an ISBN as integer: ");
		
		number = input.nextInt();
		
		String ISBN = number + "";
		
		// Mod by ten in order to get the proper place value then divide to continue easily
		digit9 = number % 10;
		
		number /= 10;
		
		digit8 = number % 10;
		
		number /= 10;
		
		digit7 = number % 10;
		
		number /= 10;
		
		digit6 = number % 10;
		
		number /= 10;
		
		digit5 = number % 10;
		
		number /= 10;
		
		digit4 = number % 10;
		
		number /= 10;
		
		digit3 = number % 10;
		
		number /= 10;
		
		digit2 = number % 10;
		
		number /= 10;
		
		digit1 = number % 10;
		
		// Calculate the check sum value using the given formula
		checksum = (digit1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;
		
		// If the checksum calculation is greater than 10, the last ISBN char should be an x
		if (checksum == 10) {
			
			ISBN += "X";
			
		} 
		
		else {
			
			// Otherwise, just print the checksum itself	
			ISBN += checksum + "";
			
		}

		System.out.printf("The ISBN-10 number is 0%s\n", ISBN);
	}
}