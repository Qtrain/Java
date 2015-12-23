package unfinishedProjects.connectfour;/**
 *  Copyright(C) 2006 Matthias Braunhofer
 *  All rights reserved
 *  
*/

public class Board {
	public final int rows = 6;
	public final int columns = 7;
	public char board[][] = new char[rows][columns];
	//The two-dimensional array called evaluationTable is used by
	//the method evaluateContent to evaluate the state of th1e 
	//board.
	private static int[][] evaluationTable = {{3, 4, 5, 7, 5, 4, 3}, 
		  				  					  {4, 6, 8, 10, 8, 6, 4},
		  				  					  {5, 8, 11, 13, 11, 8, 5}, 
		  				  					  {5, 8, 11, 13, 11, 8, 5},
		  				  					  {4, 6, 8, 10, 8, 6, 4},
		  				  					  {3, 4, 5, 7, 5, 4, 3}};

	public Board() {
		initializeBoard();
		showContent();
	}
	
	public void initializeBoard() {
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				board[i][j] = ' ';
	}
	
	public void showContent() {
		System.out.println(" 0  1  2  3  4  5  6");
		for (int j = 0; j < rows; j++) {
			for (int k = 0; k < columns; k++)
				System.out.print("[" + board[j][k] + "]");
			System.out.println();
		}
		System.out.println("---------------------------------------------------");
	}

	public boolean insert(int column, char currentPlayer) {
		if (column > 6 || column < 0 || board[0][column] != ' ')
			return false;
		else { 
			for (int i = rows-1; i >= 0; i--)
				if (board[i][column] == ' ') {
					board[i][column] = currentPlayer;
					break;
				}
			return true;
			}
	}
	
	public void remove(int column) {
		for (int i = 0; i < rows; i++) {
			if (board[i][column] != ' ') {
				board[i][column] = ' ';
				break;
			}
		}
	}
	
	public char isFinished() {
		//check for win horizontally
		for (int row=0; row<rows; row++) 
		    for (int col=0; col<columns-3; col++)
		    	if (board[row][col] != ' ' &&
		    		board[row][col] == board[row][col+1] &&  
					board[row][col] == board[row][col+2] && 
					board[row][col] == board[row][col+3]) 
					return board[row][col];
		//check for win vertically
		for (int row = 0; row < rows-3; row++)
		    for (int col = 0; col < columns; col++)
				if (board[row][col] != ' ' &&
					board[row][col] == board[row+1][col] &&
					board[row][col] == board[row+2][col] &&
					board[row][col] == board[row+3][col])
					return board[row][col];
		//check for win diagonally (upper left to lower right)
		for (int row = 0; row < rows-3; row++) 
		    for (int col = 0; col < columns-3; col++) 
				if (board[row][col] != ' ' &&
					board[row][col] == board[row+1][col+1] &&
					board[row][col] == board[row+2][col+2] &&
					board[row][col] == board[row+3][col+3]) 
					return board[row][col];
		//check for win diagonally (lower left to upper right)
		for (int row = 3; row < rows; row++) 
		    for (int col = 0; col < columns-3; col++) 
				if (board[row][col] != ' ' &&
					board[row][col] == board[row-1][col+1] &&
					board[row][col] == board[row-2][col+2] &&
					board[row][col] == board[row-3][col+3])
					return board[row][col];
		return ' ';
	}
	
	public boolean isTie() {
		for (int j = 0; j < columns; j++)
				if (board[0][j] == ' ')
					return false;
		return true;
	}
		
	public boolean isLegalMove(int column) {
		if (column > 6 || column < 0 || board[0][column] != ' ')
			return false;
		return true;
	}
	
	/**
	 * This method implements the evaluation function by taking into
	 * account the two-dimensional array evaluationTable.
	 */
	public int evaluateContent() {
		int utility = 138;
		int sum = 0;
		for (int i = 0; i < rows; i++)
			for (int j = 0; j <columns; j++)
				if (board[i][j] == 'O')
					sum += evaluationTable[i][j];
				else if (board[i][j] == 'X')
					sum -= evaluationTable[i][j];
		return utility + sum;
	}
}