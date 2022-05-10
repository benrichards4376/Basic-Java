import java.util.Scanner;
// sum of digits in a number using Methods
public class NumDigSumMethod {
	public static void main(String[] args) {
		
		int userInt;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 1000");
		
		userInt = input.nextInt();
		
		System.out.printf("The sum of the digits is %d\n", digSum(userInt));
		
		
	}
	public static int digSum(int userInt){
		
		// Define variables for the given number, each place value, and the sum of place values
		int ones, tens, hundreds, sum, thousands;
		
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
		
		return sum;
	}
}