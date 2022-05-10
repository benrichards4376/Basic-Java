import java.util.Scanner;
// Creates a calendar given the first day of the year
public class CalendarPrinter {
	public static void main(String[] args) {
		int year, day;
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a year: ");
		year = input.nextInt();
		System.out.printf("Enter the first day of the year Sun - Mon (1 - 7): ");
		day = input.nextInt();
		System.out.printf("\n");
		printCalendar(year, day);
	}
	
	public static void printCalendar(int year, int day) {
		int i, j, k, daysInMonth = 0, tempDay = day;
		String month;
		for (i = 1; i <= 12; i++)
		{
			switch (i) {
				
				case 1:
				month = "January";
				daysInMonth = 31;
				break;
				
				case 2:
				month = "February";
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					daysInMonth = 29;
				}
				else {
					daysInMonth = 28;
				}
				break;
				
				case 3:
				month = "March";
				daysInMonth = 31;
				break;
				
				case 4:
				month = "April";
				daysInMonth = 30;
				break;
				
				case 5:
				month = "May";
				daysInMonth = 31;
				break;
				
				case 6:
				month = "June";
				daysInMonth = 30;
				break;
				
				case 7:
				month = "July";
				daysInMonth = 31;
				break;
				
				case 8:
				month = "August";
				daysInMonth = 31;
				break;
				
				case 9:
				month = "September";
				daysInMonth = 30;
				break;
				
				case 10:
				month = "October";
				daysInMonth = 31;
				break;
				
				case 11:
				month = "November";
				daysInMonth = 30;
				break;
				
				case 12:
				month = "December";
				daysInMonth = 31;
				break;
				
				default:
				month = "Invalid";
				
			}
			
			System.out.printf("                  %s %d\n", month, year);
			System.out.printf("   _________________________________________\n");
			System.out.printf("    Sun   Mon   Tue   Wed   Thu   Fri   Sat\n");
			
			if (tempDay != 7) {
				for (j = 1; j <= tempDay * 6; j++) {
					
					System.out.printf(" ");
				}
			}
			
				for (j = 1; j <= 7 - tempDay; j++) {
					System.out.printf("     %d", j);
				
				}
			
			System.out.printf("\n");
			
			for (j = 8 - tempDay; j <= daysInMonth; j++) {
					
				
				if (j < 10) {
				System.out.printf("     %d", j);
				
				}
				else {
				System.out.printf("    %d", j);	
				}
				
				for (k = 1; k <= 5; k++) {
					if (j == k * 7 - tempDay) {
						System.out.printf("\n");
					}
				}
					
				if (j == daysInMonth) {
					
					System.out.printf("\n");
					
				}
			}
			if (tempDay == 7) {
			
			tempDay = 2;
			
			}
			else {
				
				tempDay++;
				
			}
		}
	}
}