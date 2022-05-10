import java.util.Scanner;

// A basic game of Rock, Paper, Scissors
public class RockPaperScissors {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int userInt = 0, compInt, winState = 0;
		
		String userStr;
		
		String compStr;
		
		System.out.printf("Enter Scissors (0), Rock (1), or Paper (2)\n");
		
		userInt = input.nextInt();
		
		// Randomly generate an option from 1 to 3 to store as the computer's choice
		compInt = (int)(Math.random() * 3);
		
		// Use the user input to determine which choice they picked and store as a String
		switch (userInt) {
			
			case 0:
			
			userStr = "Scissors";
			
			break;
			
			case 1:
			
			userStr = "Rock";
			
			break;
			
			case 2:
			
			userStr = "Paper";
			
			break;
			
			default:
			
			userStr = "Invalid";
			
		}
		
		// Use the random computer int to generate the corresponding string choice
		switch (compInt) {
			
			case 0:
			
			compStr = "Scissors";
			
			break;
			
			case 1:
			
			compStr = "Rock";
			
			break;
			
			case 2:
			
			compStr = "Paper";
			
			break;
			
			default:
			
			compStr = "Invalid";
		}
		
		System.out.printf("The computer is %s. You are %s. ", compStr, userStr);
		
		// If the two choices match, it is a tie
		if (userInt == compInt) {
			
			winState = 2;
			
		}
		
		// Boundary case where comp is paper and user is scissors, user wins
		else if (userInt == 0 && compInt == 2) {
			
			winState = 1;
			
		}
		
		// Boundary case where comp is scissors and user is paper, comp wins
		else if (compInt == 0 && userInt == 2) {
			
			winState = 0;
			
		}
		
		// The other cases in which the comp wins
		else if (userInt < compInt) {
			
			winState = 0;
			
		}
		
		// The other cases in which the user wins
		else if (userInt > compInt) {
			
			winState = 1;
			
		}
		
		// Display the game results using the winner determined previously
		switch (winState) {
			
			case 0:
			
			System.out.printf("You lost.");
			
			break;
			
			case 1:
			
			System.out.printf("You won!");
			
			break;
			
			case 2:
			
			System.out.printf("It was a draw.");
			
			break;
			
		}
	}
}