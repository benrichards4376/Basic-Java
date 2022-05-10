import java.util.Scanner;

// Determine acceleration given v0, v1, and time
public class AccelFormula {
	public static void main(String[] args){
		
		// Allow for inputs to be read from the user
		Scanner input = new Scanner(System.in);
		
		// Create variables to store acceleration, v1, v0, and time
		double accel, v1, v0, time;
		// Prompt the user to enter v0, v1, and time
		System.out.println("Enter v0, v1, and time: ");
		
		// Receive and store each input into each respective variable
		v0 = input.nextDouble();
		v1 = input.nextDouble();
		time = input.nextDouble();
		
		// Apply the given acceleration formula to find the average acceleration
		accel = (v1 - v0) / time;
		
		// Display average acceleration to the user
		System.out.println("The average acceleration is " + accel "\n");
	}
}