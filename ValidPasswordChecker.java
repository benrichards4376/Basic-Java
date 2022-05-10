import java.util.Scanner;
// Checks if a password is valid (greater than 8 chars and contains at least two numbers)
public class ValidPasswordChecker {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.printf("Enter a password: ");
		
		String password = input.nextLine();
		
		if (checkPassword(password)) {
			
			System.out.printf("Valid Password\n");
			
		}
		else {
			
			System.out.printf("Invalid Password\n");
			
		}
		
	}
	
	public static boolean checkPassword(String password) {
		
		int i, totalDigits = 0;
		
		if (password.length() >= 8) {
			
			for (i = 0; i < password.length(); i++) {
				
				if (Character.isLetter(password.charAt(i))) {
					
					continue;
					
				}
				
				else if (Character.isDigit(password.charAt(i))) {
					
					totalDigits++;
					
					continue;
					
				}
				
				else {
					
					return false;
					
				}
				
			}
			if (totalDigits >= 2) {
				
				return true;
				
			}
			
		}
		
		return false;
	}
	
}