import java.util.Random;
import java.util.Scanner;

// Creates a Bean Machine or Galton Box; A machine similar to plinko, but each
// ball has a 50% chance to go left or right at each turn.
// By definition also represents a Normal Distribution
public class GaltonBoxMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numBalls = -1, beanSlots = -1;
		
		while (beanSlots != 0) {
			System.out.printf("Enter the number of balls to drop: ");
			numBalls = input.nextInt();
			System.out.printf("Enter the number of slots in the bean machine (0 to exit) : ");
			beanSlots = input.nextInt();
			if (beanSlots != 0) {
				
				galtonBox(numBalls, beanSlots);
			
			}
		}
		
		System.out.printf("Thank you for playing!\n");
	}
	
	
	public static void galtonBox(int numBalls, int beanSlots) {
		
		Random rand = new Random();
		String path = "";
		int i, j, leftOrRight, rightCount, x;
		int maxBeans = 0;
		int[] slots = new int[beanSlots];
		slots[0] = 0;
		for (i = 0; i < numBalls; i++) {
			
			rightCount = 0;
			path = "";
			for (j = 0; j < beanSlots - 1; j++) {
			
				
				leftOrRight = rand.nextInt(2);
			
				if (leftOrRight == 0) {
					
					path += 'L';
				}
			
				else {
					
					path += 'R';
					rightCount++;
				}
				
			}
			
			slots[rightCount]++;
			System.out.printf("%s\n", path);
		}
		for (i = 0; i < beanSlots; i++) {
			
			if (slots[i] > maxBeans) {
				
				maxBeans = slots[i];
				
			}
			
		}
		
		System.out.printf("\n\n");
		for (i = 0; i < maxBeans; i++) {
			
			for (j = 0; j < beanSlots; j++) {
				System.out.printf("%c", x = (slots[j] >= maxBeans - i)? '0': ' ');
			}
			System.out.printf("\n");
		}
	}
	
}