import java.util.Scanner;

// Given loan amount and number of years, determine the monthly and total payment

public class LoanPaymentCalc {
	public static void loanShark(double loanAmount, int numYears) {
		double annIntRate, monthlyInterest, monthlyPay, totalPay;
		
		// Print headers for the table
		System.out.printf("Interest Rate    Monthly Payment    Total Payment\n\n");
		
		
		// Start the interest rate at 5% and increment it by 1/8
		for (annIntRate = 5.0; annIntRate <= 8; annIntRate += 0.125) {
			System.out.printf("%.3f%%           ", annIntRate);
			
			// Using the given formulas, determine the monthly payment and interest and display them
			monthlyInterest = annIntRate / 1200;
			monthlyPay = loanAmount * monthlyInterest / (1 - (1 / Math.pow(1 + monthlyInterest, numYears * 12)));
			
			// Calculate the total payment to be made over the given years
			totalPay = ((monthlyPay * 12) * numYears);
			
			
			System.out.printf("%.2f           ", monthlyPay);
			System.out.printf("%.2f     \n", totalPay);
		}
	}
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double loanAmount;
		int numYears;
		
		System.out.printf("Enter the loan amount: ");
		loanAmount = input.nextDouble();
		
		System.out.printf("Enter the number of years: ");
		numYears = input.nextInt();
		
		loanShark(loanAmount, numYears);
		
		}
	}