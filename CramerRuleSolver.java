import java.util.Scanner;
// Get variables from the user and solve using Cramer's Rule
public class CramerRuleSolver {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
        System.out.printf("Enter a, b, c, d, e, f: ");

        double a = input.nextDouble();
		
        double b = input.nextDouble();
		
        double c = input.nextDouble();
		
        double d = input.nextDouble();
		
        double e = input.nextDouble();
		
        double f = input.nextDouble();
		
		// Check if there are valid solutions
        if((a * d - b * c) == 0) {
			
            System.out.printf("The equation has no solution.");
			
        }
		
		// Compute solutions using Cramer's Rule
		else {
			
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
			
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
			
            System.out.printf("x is %.2f and y is %.2f ", x, y);
		}
	}
}
