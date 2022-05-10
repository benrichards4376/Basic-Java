import java.util.Scanner;

// Determines whether two arrays are equal
public class ArrayEqualsChecker {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int i, size;
		System.out.printf("How many integers do you want to enter? ");
		size = input.nextInt();
		int[] list1 = new int[size];
		int[] list2 = new int[size];
		System.out.printf("Enter list1: ");
		for (i = 0; i < size; i++) {
			
			list1[i] = input.nextInt();
			
		}
		System.out.printf("Enter list2: ");
		for (i = 0; i < size; i++) {
			
			list2[i] = input.nextInt();
			
		}
		if(equals(list1, list2)) {
			
			System.out.printf("The two lists are strictly identical\n");
			
		}
		else {
			
			System.out.printf("The two lists are not strictly identical\n");
			
		}
	}
	
	public static boolean equals(int[] list1, int[] list2) {
		int i;
		
		for (i = 0; i < list1.length; i++) {
			
			if (list1[i] != list2[i]) {
				
				return false;
				
			}
			
		}
		return true;
	}

	
}