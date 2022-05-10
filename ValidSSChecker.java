import java.util.Scanner;

public class ValidSSChecker {
	// Prompt the user to enter their S.S. number and check if it is valid
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int i, valid = 0;
		System.out.println("Enter an SS number in the form (XXX-XX-XXXX): ");
		
		String SocSec = input.next();
		
		// Check if the length of their input is the proper size and if hyphens are at the proper index
		// Otherwise the input is invalid so set 'valid' to 0
		if (SocSec.length() != 11 || SocSec.charAt(3) != '-' || SocSec.charAt(6) != '-') {
			
			valid = 0;
			
		}
		
		// Check each character to make sure it is a digit
		// If it is, set 'valid' to 1
		// If it is not, it is invalid, set 'valid' to 0 and break the loop
		else {
			for (i = 0; i < 11; i++) {
				
				if (i != 3 && i != 6) {
					
					if (Character.isDigit(SocSec.charAt(i))) {
						
					valid = 1;
					
					}
					
					else {
						
						valid = 0;
						
						break;
						
					}
				}
			}
			
			
		}
		
		if (valid == 0) {
			
			System.out.printf("%s is an invalid social security number\n", SocSec);
			
		}
		else {
			
			System.out.printf("%s is a valid social security number\n", SocSec);
			
		}
	}
}