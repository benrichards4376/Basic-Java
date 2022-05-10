import java.util.Scanner;
// Finds the average test score and displays how many scores are above and below average
public class TestScoreData {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int j = 0, aboveAverage = 0, belowAverage = 0, k;
		double sum = 0, average, i = 0;
		double[] scores = new double[100];
		
		for (j = 0; j < 100; j++) {
			System.out.printf("Enter scores (-1 to exit): ");
			i = input.nextDouble();
			if (i == -1)
				break;
			
			scores[j] = i;
			sum += scores[j];
			
		}
		average = (double) sum / j;
		System.out.printf("average: %f\nsum: %f\n", average, sum);
		
		for (k = 0; k < j; k++) {
			
			if (scores[k] >= average){
				
				aboveAverage++;
				
			}
			else {
				
				belowAverage++;
				
			}
			
		}
		System.out.printf("Scores above or equal to average: %d, Scores below average: %d\n", aboveAverage, belowAverage);
		
	}
}