import java.util.Scanner;

// Determines if a given 2D array is a Markov Matrix
public class MarkovMatrixChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, j;
		double[][] m = new double[3][3];
		System.out.printf("Enter a 3-by-3 matrix row by row: ");
		for (i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				m[i][j] = input.nextDouble();
				
			}
			
		}	
		if (isMarkovMatrix(m)) {
			
			System.out.printf("It is a Markov matrix\n");
			
		}
		else {
			
			System.out.printf("It is not a Markov matrix\n");
			
		}
	}
	
	public static boolean isMarkovMatrix(double[][] m) {
		
		int i, j;
		boolean state;
		for (i = 0; i < m.length; i++) {
			
			for (j = 0; j < m.length; j++) {
				
				if (m[i][j] < 0) {
					
					return false;
					
				}
					
			}
			
		}
		
		return state = (m[2][0] + m[1][0] + m[0][0] == 1 && m[2][1] + m[1][1] + m[0][1] == 1
		&& m[2][2] + m[1][2] + m[0][2] == 1)? true: false;
	}
	
	
}