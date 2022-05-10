import java.util.Scanner;

// Finds the maximum square submatrix and its location within a square matrix
public class MaxSquareSubMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numRows, i, j;
		
		System.out.printf("Enter the number of rows in the matrix: ");
		numRows = input.nextInt();
		int[][] m = new int[numRows][numRows];
		System.out.printf("Enter the matrix row by row: ");
		for (i = 0; i < numRows; i++) {
			
			for (j = 0; j < numRows; j++) {
				
				m[i][j] = input.nextInt();
				
			}
			
		}
		int[] infoArray = new int[3];
			infoArray = findLargestBlock(m);
		System.out.printf("The maximum square submatrix is at (%d, %d) with size %d\n", infoArray[1], infoArray[2], infoArray[0]);
	}
	
	public static int min(int k, int l) {
		
		if (k < l) {
			
			return k;
			
		}
		return l;
		
	}
	
	public static int[] findLargestBlock(int[][] m) {
		
		int i, j, k, l, tempVal = m.length, tempStartI = 0, tempStartJ = 0, tempSize = 0, maxSize = 0;
		int[] subSizeStartEnd = new int[3];
		
		for (i = 0; i < m.length - 1; i++) {
		
			for (j = 0; j < m.length - 1; j++) {
				
				if (m[i][j] == 1) {
					tempStartI = i;
					tempStartJ = j - 1;
					if (m[i + 1][j + 1] == 1) {
						
						for (k = i + 1, l = j + 1; l >= 0; l--) {
							
							if (m[k][l] == 0) {
								
								tempSize = j;
								break;
								
							}
							
						}
						
						for (k = i + 1, l = j + 1; k >= 0; k--) {
							
							if (m[k][l] == 0) {
								
								tempSize = i;
								break;
								
							}
							
						}
						if (tempSize > subSizeStartEnd[0]) {
							
							subSizeStartEnd[0] = tempSize;
							subSizeStartEnd[1] = tempStartI;
							subSizeStartEnd[2] = tempStartJ;
							
						}
						
					}
					
				}
			}
			
		}

		return subSizeStartEnd;
		
	}

}