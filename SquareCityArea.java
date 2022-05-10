import java.util.Scanner;

// Using four city coordinates, calculate the total area between them
public class SquareCityArea {
	
	public static void main(String[] args) {
		
		// Create variables to store the x and y coordinates for each city, as well as the Earth's radius in kilometers
		double chx = Math.toRadians(35.2270869), chy = Math.toRadians(-80.8431267);
		
		double atlax = Math.toRadians(33.7489954), atlay = Math.toRadians(-84.3879824);
		
		double savx = Math.toRadians(32.0835407), savy =  Math.toRadians(-81.0998342);
		
		double orlx = Math.toRadians(28.5383355), orly = Math.toRadians(-81.3792365);
		
		double earthRadius = 6371.01;
		
		
		// Calculate the distance between them by using the distance formula for large spheres
		// Create variables to store the distance between the cities
		double distAC = earthRadius * Math.acos(Math.sin(chx) * (Math.sin(atlax)) + Math.cos(chx) * Math.cos(atlax) * Math.cos(chy - atlay));
		
		double distCS = earthRadius * Math.acos(Math.sin(savx) * (Math.sin(chx)) + Math.cos(savx) * Math.cos(chx) * Math.cos(savy - chy));
		
		double distSA = earthRadius * Math.acos(Math.sin(atlax) * (Math.sin(savx)) + Math.cos(atlax) * Math.cos(savx) * Math.cos(atlay - savy));
		
		double distAO = earthRadius * Math.acos(Math.sin(orlx) * (Math.sin(atlax)) + Math.cos(orlx) * Math.cos(atlax) * Math.cos(orly - atlay));
		
		double distSO = earthRadius * Math.acos(Math.sin(orlx) * (Math.sin(savx)) + Math.cos(orlx) * Math.cos(savx) * Math.cos(orly - savy));
		
		
		// Split the area into two triangles
		// Calculate the s values to be used in the triangle area formula
		double sTriangle1 = (distAC + distCS + distSA) / 2;
		
		double sTriangle2 = (distAO + distSO + distSA) / 2;
		
		
		// Using the triangle area formula, calculate the area of both geographic triangles
		double areaT1 = Math.sqrt(sTriangle1 * (sTriangle1 - distAC) * (sTriangle1 - distCS) * (sTriangle1 - distSA));
		
		double areaT2 = Math.sqrt(sTriangle2 * (sTriangle2 - distAO) * (sTriangle2 - distSO) * (sTriangle2 - distSA));
		
		
		// Add the individual areas to find the total area between the cities
		System.out.printf("The area between the four cities is %f kilometers\n", areaT1 + areaT2);
	}
}