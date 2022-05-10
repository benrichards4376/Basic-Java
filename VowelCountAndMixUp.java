import java.util.Scanner;
// creates two classes, one that counts the number of vowels in a string, the other mixes up the string
public class VowelCountAndMixUp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Part a.
		System.out.printf("Enter a string: ");
		String message = input.nextLine();
		System.out.printf("%s\n", mixUp(message));
		
		// Part b.
		System.out.printf("Enter a string: ");
		String userString = input.nextLine();
		conVowCount(userString);
		
	}
	
	public static String mixUp (String message) {
		
		int i;
		
		String newMessage = "";
			
		for (i = 0; i < message.length(); i++) {
			if (i % 2 == 0) {
				newMessage += message.charAt(i);
			}
		}
			
		return newMessage;
	}
	
	public static void conVowCount (String userString) {
	
		int i;
		
		int consonants = 0, vowels = 0;
		
		for (i = 0; i < userString.length(); i++) {
			if (Character.isLetterOrDigit(userString.charAt(i))) {	
				if (userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i' || userString.charAt(i) == 'o' || userString.charAt(i) == 'u') {
					vowels++;
				}
				else {
					consonants++;
					
				}
				
			}
			
		}
		
		System.out.printf("The number of vowels is %d\n", vowels);
		System.out.printf("The number of consonants is %d\n", consonants);

		
	}
}