// computes the number of days in a year 
import java.util.Scanner;
public class NumDaysInGivenYear {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		System.out.printf("Days in year %d: %d\n", year, numberOfDaysInAYear(year));
		
	}
	public static int numberOfDaysInAYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			
			return 366;
			
		}
		else {
			
			return 365;
			
		}
		
	}
}