import java.util.Scanner;
// Use the center of two circles and their radii to determine whether they overlap or one is inside the other
public class OverlapCircleCalc {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double centDist, tempDistx, tempDisty;
		
		double x1, y1, x2, y2, r1, r2;
		
		System.out.printf("Enter circle 1's center (x-, y-coordinates, and radius): ");
		
		x1 = input.nextDouble();
		
		y1 = input.nextDouble();
		
		r1 = input.nextDouble();
		
		System.out.printf("Enter circle 2's center (x-, y-coordinates, and radius): ");
		
		x2 = input.nextDouble();
		
		y2 = input.nextDouble();
		
		r2 = input.nextDouble();
		
		// use temp values to store parts of formulas to make lines more readable
		tempDistx = Math.pow((x2 - x1), 2);
		
		tempDisty = Math.pow((y2 - y1), 2);
		
		// Calculate the distance between the center usign the distance formula
		centDist = Math.sqrt(tempDistx + tempDisty);
		
		
		// A circle is inside another if the distance between their centers is less than the abs values
		// Of the difference between their radii
		// A circle overlaps the other if the distance between centers is less than the sum of their radii
		if (centDist <= (r1 + r2)) {
			
			System.out.println("\nCircle 2 overlaps Circle 1.\n");
			
		}
		
		else if (centDist <= Math.abs(r1 - r2)) {
			
			System.out.println("\nCircle 2 is inside Circle 1.\n");
			
		} 
		
	}
}