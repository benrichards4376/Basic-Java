import java.util.Scanner;

// Using a variety of user info, display wages after federal and state income tax, as well as their name
public class TaxWitholdingRate {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double hrsWork, hrlyPay, fedTaxRt, staTaxRt, totalDed, netPay, grossPay; 
		
		// Prompt the user to enter the informtation needed for calculation
		System.out.printf("Enter employee's name: ");
		
		String name = input.next();
		
		System.out.printf("Enter number of hours worked in a week: ");
		
		hrsWork = input.nextDouble();
		
		System.out.printf("Enter hourly pay rate: ");
		
		hrlyPay = input.nextDouble();
		
		System.out.printf("Enter federal tax withholding rate: ");
		
		fedTaxRt = input.nextDouble();
		
		System.out.printf("Enter state tax withholding rate: ");
		
		staTaxRt = input.nextDouble();
		
		// Display the information back to them
		System.out.printf("\nEmployee Name: %s\n", name);
		
		System.out.printf("Hours Worked: %f\n", hrsWork);
		
		System.out.printf("Pay Rate: $%f\n", hrlyPay);
		
		// Hourly pay times hours worked is the total income before taxes
		grossPay = hrlyPay * hrsWork;
		
		System.out.printf("Gross Pay: $%f\n", grossPay);
		
		// Convert the Tax rates to percentages and multiply grossPay by the initial tax rates to determine deductions
		System.out.printf("Deductions:\n Federal Withholding (%.1f%%): $%.2f\n", fedTaxRt * 100, fedTaxRt * grossPay);
		
		System.out.printf(" State Withholding: (%.1f%%): $%.2f\n", staTaxRt * 100, staTaxRt * grossPay);
		
		System.out.printf(" Total Deduction: $%.2f\n", grossPay * (staTaxRt + fedTaxRt));
		
		// Subtract the total deductions from grossPay to get the net income
		System.out.printf("Net Pay: $%.2f\n", grossPay - (grossPay * (staTaxRt + fedTaxRt)));
		
	}
}