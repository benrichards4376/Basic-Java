import java.util.Scanner;

// Given a number between 1 and 1000, print the sum of the digits in that number
public class NumDigSum {
	public static void main(String[] args){
		
		// Define variables for the given number, each place value, and the sum of place values
		int userInt, ones, tens, hundreds, sum, thousands;
		
		// Allow for an input to be received from the user
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a number between 1 and 1000
		System.out.println("Enter a number between 1 and 1000");
		
		// Receive input from user and assign that value to 'userInt'
		userInt = input.nextInt();
		
		// Find the ones value in 'userInt' and assign it to 'ones'
		ones = userInt % 10;
		
		// Find the tens value in 'userInt' and assign it to 'tens'
		tens = (userInt / 10) % 10;
		
		// Find the hundreds value in 'userInt' and assign it to 'hundreds'
		hundreds = (userInt / 100) % 10;
		
		// Find the thousands value in 'userInt' and assign it to 'thousands'
		thousands = (userInt / 1000) % 10;
		
		// Add the place values and assign the sum to 'sum'
		sum = ones + tens + hundreds + thousands;
		
		// Display 'sum' to the screen
		System.out.println("The sum of the digits is " + sum + ".\n");
	}
}