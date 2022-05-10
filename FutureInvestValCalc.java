import java.util.Scanner;

// Given invest amount, annual interest rate and years, determine future invest value
public class FutureInvestValCalc {
	public static void main(String[] args) {
		
		// Allow for user inputs to be received
		Scanner input = new Scanner(System.in);
		
		// Create variables to store the given values as well as monthly interest rate and a readability 'tempVal'
		double investAmount, annIntRate, futInvestValue, monthlyIntRate, tempVal, years;
		
		// Prompt user to enter invest amount and store it in 'investAmount'
		System.out.println("Enter investment amount: ");
		investAmount = input.nextDouble();
		
		// Prompt user to enter annual interest and store it in 'annIntRate'
		System.out.println("Enter annual interest rate in percentage: ");
		annIntRate = input.nextDouble();
		
		// Prompt user to enter total years and store it in 'years'
		System.out.println("Enter number of years: ");
		years = input.nextDouble();
		
		// Convert annual interest rate to monthly
		monthlyIntRate = annIntRate / 12;
		
		// Perform some of the given formula to increase readability
		tempVal = Math.pow((monthlyIntRate * .01) + 1, years * 12);
		
		// Perform the rest of the given formula to determine future invest value and store it in 'futInvestValue'
		futInvestValue = tempVal * investAmount;
		
		// Diplay 'futInvestValue'
		System.out.printf("Future value is $%.2f\n", futInvestValue);
	}
}