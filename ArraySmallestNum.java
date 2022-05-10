import java.util.Scanner;

// Finds the smallest number in an array
public class ArraySmallestNum {
	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		double userArray[] = new double[10];
		System.out.printf("Enter ten numbers: ");
		for (i = 0; i < 10; i++) {
			
			userArray[i] = input.nextDouble();
			
		}
		System.out.printf("The smallest number is %.2f\n", min(userArray));
	}
	
	public static double min(double[] array) {
		
		double min = array[0];
		int i;
		
		for (i = 1; i < 10; i++) {
			
			if (array[i] < min) {
				
				min = array[i];
				
			}
			
		}
		return min;
		
	}
}