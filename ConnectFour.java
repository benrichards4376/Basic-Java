import java.util.Scanner;

// Simulates Connect Four
public class ConnectFour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean win = false;
		int turn = 1, i, j, col;
		char[][] currentBoard = new char[6][7];
		int[] numChipsInColumn = new int[7];
		String winner = "";
		String player = "";
		
		for (i = 0; i < 6; i++) {
			
			for (j = 0; j < 7; j++) {
				
				currentBoard[i][j] = ' ';
				
			}
			
		}
		
		printBoard(currentBoard);
		while (win == false) {
			
			System.out.printf("Drop a %s disk at column (0-6): ", player = (turn % 2 == 0)? "yellow": "red");
			col = input.nextInt();
			System.out.printf("\n");				
			currentBoard = nextTurn(currentBoard, numChipsInColumn, turn, col);
			numChipsInColumn[col]++;
			turn++;
			win = checkWin(currentBoard);
			
		}
		System.out.printf("The %s player won\n", winner = ((turn - 1) % 2 == 0)? "yellow" : "Red");
		
		
	}
	public static void printBoard(char[][] currentBoard) {
		
		int i, j;
		String player = "";
		char piece;
		for (i = 0; i < currentBoard.length; i++) {
			
			for (j = 0; j < 7; j++) {
				
				System.out.printf("|%c", currentBoard[i][j]);
				
			}
			System.out.printf("|\n");
		}
		System.out.printf("_______________\n");
	}
	public static char[][] nextTurn(char[][] currentBoard, int[] numChipsInColumn, int turn, int col) {
		
		if (turn % 2 == 0) {
			
			currentBoard[currentBoard.length - numChipsInColumn[col] - 1][col] = 'Y';
			
		}
		else {
			
			currentBoard[currentBoard.length - numChipsInColumn[col] - 1][col] = 'R';
			
		}
		
		printBoard(currentBoard);	
		return currentBoard;
	}
	public static boolean checkWin(char[][] currentBoard) {
		int i, j, k, l, consecChips;
		
		for (i = 0; i < currentBoard.length; i++) {
			
			for (j = 0; j < 7; j++) {
				
				consecChips = 0;
				
				if (currentBoard[i][j] != ' ') {
					
					// Diagonal Check
					for (k = i, l = j; k < currentBoard.length && l < currentBoard.length; k++, l++) {
							
						if (currentBoard[k][l] != currentBoard[i][j])
						{
							
							break;
							
						}
						if (k - i + 1 == 4) {
							
							return true;
							
						}
							
						
					}
					for (k = i, l = j; k < currentBoard.length && l >= 0; k++, l--) {
							
						if (currentBoard[k][l] != currentBoard[i][j])
						{
							
							break;
							
						}
						if (k - i + 1 == 4) {
							
							return true;
							
						}
							
						
					}
					
					// Vertical check
					for (k = i, l = j; k < currentBoard.length; k++) {
						
						if (currentBoard[k][l] != currentBoard[i][j]) {
							
							break;
							
						}
						if (k - i + 1 == 4) {
							
							return true;
							
						}
					}
					
					// Horizontal check
					for (k = i, l = j; l < currentBoard.length + 1; l++) {
						
						if (currentBoard[k][l] != currentBoard[i][j]) {
							
							break;
							
						}
						if (l - j + 1 == 4) {
							
							return true;
							
						}
					}
					
				}
				
			}
			
		}
		return false;
		
	}
	
}