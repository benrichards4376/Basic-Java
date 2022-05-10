import java.util.Random;
// Times Linear and Binary Search
public class SearchMethodTimer {
	public static void main(String[] args) {
		
		Random random1 = new Random();
		long[] sortedArray = getSortedArray(100000); 
		long startTime = System.currentTimeMillis();
		linearSearch(sortedArray, 100000, random1.nextInt(100000));
		long endTime = System.currentTimeMillis();
		long linearExecutionTime = endTime - startTime;
		startTime = System.currentTimeMillis();
		binarySearch(sortedArray, 100000, (int) Math.random() * 100000 + 1);
		endTime = System.currentTimeMillis();
		long binaryExecutionTime = endTime - startTime;
		
		System.out.printf("Linear search run time: %d ms\nBinary search run time: %d ms\n", linearExecutionTime, binaryExecutionTime);
		
	}
	
	public static long[] getSortedArray(int n) {
		Random random2 = new Random();
		int i;
		long[] sortedArray = new long[n];
		sortedArray[0] = 0;
		for (i = 1; i < n; i++) {
			
			sortedArray[i] = (random2.nextInt() + sortedArray[i-1]);
			
		}
		return sortedArray;
		
	}
	
	public static int linearSearch(long[] array, int size, int key) {
		int i;
		
		for (i = 0; i < size; i++) {
			
			if (array[i] == key) {
				
				return 1;
				
			}
			
		}
		return 0;
	}
	
	public static int binarySearch(long[] array, int size, int key) {
		
		int mid, low = 0, high = size - 1;
		
		while (low <= high) {
			
			mid = low + (high - low) / 2;
			
			if (key < array[mid]) {
				
				high = mid - 1;
				
			}
			else if (key > array[mid]) {
				
				low = mid + 1;
				
			}
			else {
				
				return 1;
				
			}
			
		}
		return 0;
	}
}