import java.util.Scanner;

// Given three coordinates determine the area of the triangle formed by them
public class TriangulateArea {
	public static void main(String[] args) {
		
		// Allow for user inputs to be received
		Scanner input = new Scanner(System.in);
		
		// Create variables to store coordinates, side lengths, s, and area
		double x1, x2, x3, y1, y2, y3, s0, s1, s2, s3, area;
		// Prompt the user to enter each coordinate
		System.out.println("Enter the coordinate of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
		
		// Store each part of the coordinate in an individaul double
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		// Use the distance formula to determine side lengths between each point
		s1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		s2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		s3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		
		// Use the given formula to determine s and assign it to 's0'
		s0 = (s1 + s2 + s3) / 2;
		
		// Use the given area formula to determine triangle area and assign it to 'area'
		area = Math.sqrt(s0 * (s0 - s1) * (s0 - s2) * (s0 - s3));
		
		// Display the triangle area to the screen
		System.out.println("the area of the triangle is " + area".\n");
	}
}