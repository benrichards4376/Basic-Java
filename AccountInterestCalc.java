import java.util.Scanner;

// Given the monthly investment, display the account value after six months with compund interest
public class AccountInterestCalc {
	public static void main(String[] args) {
		// Use the given fixed interest rate
		final double interest = 1.00417;
		
		// Allow for user inputs to be received
		Scanner input = new Scanner(System.in);
		
		// Create variables to store a value for each month of interest gained
		double firstAfterInterest, first, second, third, fourth, fifth, sixth;
		
		// Prompt the user to enter the monthly investment
		System.out.println("Enter the monthly saving amount: ");
		
		// Store their input in 'first'
		first = input.nextDouble();
		
		// Determine account balance by applying the interest formula to each month dependently
		firstAfterInterest = first * interest;
		second = (firstAfterInterest + first) * interest;
		third = (second + first) * interest;
		fourth = (third + first) * interest;
		fifth = (fourth + first) * interest;
		sixth = (fifth + first) * interest;
		
		// Display the account balance after six months
		System.out.printf("After the sixth month, the account value is $%.2f\n", sixth);
	}
}