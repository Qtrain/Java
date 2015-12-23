package unfinishedProjects.connectfour;


/**
 *  Copyright(C) 2006 Matthias Braunhofer
 *  All rights reserved
 *  
*/

public class ComputerPlayer {
	private char mySymbol = 'O';
	private char opponentSymbol = 'X';
	private int searchLimit;
	private int maxColumn;
	
	
	public ComputerPlayer(int limit) {
		searchLimit = limit;
	}
	
	/**
	 * This method calls the miniMaxValue method and it returns the
	 * column that corresponds to the column with the highest minimax
	 * value.
	 */
	public int miniMaxDecision(Board board) {
		miniMaxValue(board, 0, mySymbol);
		return maxColumn;
	}
	
	/**
	 * This method implements the minimax algorithm. It returns either the 
	 * highest minimax value that is possible for the max player 
	 * starting from the passed board state or the lowest minimax value 
	 * that is possible for the min player starting from the passed board 
	 * state. It also modifies the global variable maxColumn that is 
	 * associated to the column with the highest minimax value.
	 */
	private int miniMaxValue(Board board, int depth, char playerToMove) {
		//check if the board is in a terminal (winning) state and
		//return the maximum or minimum utility value (255 - depth or 
		//0 + depth) if the max player or min player is winning.
		if (board.isFinished() != ' ')
			if (board.isFinished() == mySymbol)
				return 255 - depth;
			else return 0 + depth; 
		//check if the depth has reached its limit or if the 
		//board is in a terminal (tie) state and return its utility value.
		if (depth == searchLimit || board.isTie()) {
			return board.evaluateContent();
		}
		depth = depth + 1;
		if (playerToMove == mySymbol) {
			int max = Integer.MIN_VALUE;
			int column = 0;
			for (int i = 0; i < board.columns; i++) 
				if (board.isLegalMove(i)) {
					board.insert(i, mySymbol);
					int value = miniMaxValue(board, depth, opponentSymbol);
					if (max < value) {
						max = value;
						column = i;
					}
					board.remove(i);
			}
			maxColumn = column;
			return max;
		} else {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < board.columns; i++) 
				if (board.isLegalMove(i)) {
					board.insert(i, 'X');
					int value = miniMaxValue(board, depth, mySymbol);
					if (min > value)
						min = value;
					board.remove(i);
				}
			return min;
		}
	}
}
	/**
	 * The methods alphaBetaSearch, maxValue and minValue implement
	 * the alpha-beta pruning algorithm. This method simply calls
	 * the maxValue method and it returns the column that corresponds to 
	 * that column with the highest maxValue value. 
//	 */
//	public int alphaBetaSearch(Board board) {
//		maxValue(board, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
//		return maxColumn;
//	}
//	
//	/**
//	 * This method returns the highest utility value that is possible
//	 * for the max player by starting from the passed board state. It
//	 * also modifies the global variable maxColumn that is associated
//	 * to the column with the highest maxValue value.
//	 */
//	private int maxValue(Board board, int depth, int alpha, int beta) {
//		//check if the board is in a terminal (winning) state and
//		//return the maximum or minimum utility value (255 - depth or 
//		//0 + depth) if the max player or min player is winning.
//		if (board.isFinished() != ' ') 
//			if (board.isFinished() == mySymbol)
//				return 255 - depth;
//			else return 0 + depth; 
//		//check if the depth has reached its limit or if the 
//		//board is in a terminal (tie) state and return its utility value.
//		if (depth == searchLimit || board.isTie())
//			return board.evaluateContent();
//		depth = depth + 1;
//		int column = 0;
//		for (int i = 0; i < board.columns; i++) { 
//			if (board.isLegalMove(i)) {
//				board.insert(i, mySymbol);
//				int value = minValue(board, depth, alpha, beta);
//				if (value > alpha) {
//					alpha = value;
//					column = i;
//				}
//				board.remove(i);
//				if (alpha >= beta) 
//					return alpha;
//			}
//		}
//		maxColumn = column;
//		return alpha;
//	}
//
//	/**
//	 * This method returns the lowest utility value that is possible
//	 * for the min player by starting from the passed board state.
//	 */
//	private int minValue(Board board, int depth, int alpha, int beta) {
//		//check if the board is in a terminal (winning) state and
//		//return the maximum or minimum utility value (255 - depth or 
//		//0 + depth) if the max player or min player is winning.
//		if (board.isFinished() != ' ')
//			if (board.isFinished() == mySymbol)
//				return 276 - depth;
//			else return 0 + depth;
//		//check if the depth has reached its limit or if the 
//		//board is in a terminal (tie) state and return its utility value.
//		if (depth == searchLimit || board.isTie())
//			return board.evaluateContent();
//		depth = depth + 1;
//		for (int i = 0; i < board.columns; i++) {
//			if (board.isLegalMove(i)) {
//				board.insert(i, opponentSymbol);
//				int value = maxValue(board, depth, alpha, beta);
//				if (value < beta)
//					beta = value;
//				board.remove(i);
//				if (beta <= alpha) 
//					return beta;
//			}
//		}
//		return beta;
//	}
//}
//	