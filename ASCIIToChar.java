import java.util.Scanner;

// Given an ASCII code, display its corresponding character
public class ASCIIToChar {
	
	public static void main(String[] args) {
		
		int ascii;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter an ASCII code: ");
		
		ascii = input.nextInt();
		
		// Java views chars as an int value on the ASCII table
		// Thus, using %c to display an int will show its ASCII representation
		System.out.printf("The character for the ASCII code %d is %c\n", ascii, ascii);
		
	}
}