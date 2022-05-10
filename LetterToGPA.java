import java.util.Scanner;

// Turn a letter grade into its GPA value
public class LetterToGPA {
	public static void main(String[] args) {
		
		char grade;
		
		int numberGrade = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a letter grade: ");
		
		grade = input.next().charAt(0);
		
		// Go through each potential grade case and assign numberGrade with the corresponding GPA value
		switch (grade) {
			
			case 'A':
			
			System.out.printf("The numeric value for grade %c is ", grade);
			
			numberGrade = 4;
			
			break;
			
			case 'B':
			
			System.out.printf("The numeric value for grade %c is ", grade);
			
			numberGrade = 3;
			
			break;
			
			case 'C':
			
			System.out.printf("The numeric value for grade %c is ", grade);
			
			numberGrade = 2;
			
			break;
			
			case 'D':
			
			System.out.printf("The numeric value for grade %c is ", grade);
			
			numberGrade = 1;
			
			break;
			
			case 'F':
			
			System.out.printf("The numeric value for grade %c is ", grade);
			
			numberGrade = 0;
			
			break;
			
		}
		
		// Check if the input is valid and print the result
		if (grade <= 'F' && grade >= 'A') {
			
		System.out.printf("%d\n", numberGrade);
		
		}
		
		else {
			
			System.out.printf("%c is an invalid grade\n", grade);
			
		}
		
	}
	
}