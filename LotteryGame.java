import java.util.Scanner;

// Get a random 3 digit number and compare it to a guess from the user
// the user wins a different prize depending on the order and quantity of matching numbers
public class LotteryGame {
	
	public static void main(String[] args) {
		
		// Use the random function to generate 3 numbers between 1 and 10
		String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10) + (int) (Math.random() * 10);
		
		int matches = 0, i;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter your lottery pick (three digits, no spaces): ");
		
		// Store the user's guess here inside 'guess'
		String guess = input.nextLine();
		
		System.out.printf("The lottery number is %s\n", lottery);
		
		// If the guess matches the drawn lottery in the right order
		if (guess.equals(lottery)) {
			
			System.out.printf("Exact match: you win $10,000");
			
		}
		
		else {
			
			// Loop through each digit in the guess and compare it to each drawn digit
			// If a guess digit matches a lottery number, increment matches by 1
			for (i = 0; i < 3; i++) {
				if (guess.charAt(i) == lottery.charAt(0) || guess.charAt(i) == lottery.charAt(1) || guess.charAt(i) == lottery.charAt(2)) {
					
				matches++;
				
				} 
				
			}
			
			// Display a different prize amount to the user based on how many matches they had
			switch (matches) {
				
				case 0:
				
				System.out.printf("Sorry, no matches\n");
				
				break;
				
				case 1:
				case 2:
				
				System.out.printf("You matched %d digits, you win $1,000\n", matches);
				
				break;
				
				case 3:
				
				System.out.printf("You matched all digits, you win $3,000\n");
				
				break;
			}
		}
	}
}