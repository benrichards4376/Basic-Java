// Print out a formatted tower of powers of 2
import java.util.Scanner;
public class PowerPyramid {
	public static void main(String[] args) {
		int i, j, k = 0;
		for (i = 0; i < 8; i++) {
			
			for (j = 0; j <= 7 - i; j++) {
				System.out.printf("   ");
			}
			
			for (k = 0; k <= i; k++) {
				if (Math.pow(2, k) < 10) {
					System.out.printf("%d  ", (int) Math.pow(2, k));
				}
				
				else if (Math.pow(2, k) < 100) {
				
					System.out.printf("%d ",(int) Math.pow(2, k));
				}
			
				else {
				
					System.out.printf("%d ", (int) Math.pow(2, k));
				}
			}
			
			for (k = i - 1; k >= 0; k--) {
				if (i > 0 && Math.pow(2, k) < 10) {
				
					System.out.printf("%d  ", (int) Math.pow(2, k));
				}
			
				else if (i > 0 && Math.pow(2, k) < 100) {
				
					System.out.printf("%d ", (int) Math.pow(2, k));
				}
			
				else {
				
					System.out.printf("%d ", (int) Math.pow(2, k));
				}
			}
			
			for (j = 0; j < 7 - i; j++) {
				System.out.printf(" ");
			}
			
			System.out.printf("\n");
		}
	}
}