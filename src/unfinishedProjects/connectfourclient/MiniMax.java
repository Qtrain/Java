/**
 * Implementation of minimax algorithm.  I left it at two levels of recursion
 * so that the process may be easily visualized.  If you want the algo to work
 * best increase searchLevelLimit to 8 and comment out all //debug statement printlns
 */
package unfinishedProjects.connectfourclient;

/**
 *
 * @author qtrain
 */
public class MiniMax {

    protected char player1 = 'X';
    protected char player2 = 'O';
    protected int searchLevelLimit;
    protected int maxColumn;

    //the max depth allowable without severely impacting time to run
    //looking 8 moves ahead for best spot based on utility function
    //change here to lower the depth of recursion.
    public MiniMax() {
        this.searchLevelLimit = 2;
    }
  
    	public int miniMaxDecision(BoardClass board) {
		miniMaxValue(board, 0, player1);
		return maxColumn;
	}

    private int miniMaxValue(BoardClass board, int depth, char playerToMove) {
	//check if the board is in a terminal (winning) state and
        //return the maximum or minimum utility value (276 - depth or 
        //0 + depth) if the max player or min player is winning.
        if (board.checkForWin() != ' ') {
            if (board.checkForWin() == player1) {
                //debug statement
                System.out.println("terminal maximizer " + (276-depth));
                return 276 - depth;
            } else {
                //debug statement
                System.out.println("terminal minimizer " + (0+depth));
                return 0 + depth;
            }
        }
	//check if the depth has reached its limit or if the 
        //board is in a terminal (tie) state and return its utility value.
        if (depth == searchLevelLimit || board.isTie()) {
            return board.evaluateContent();
        }
        depth += 1;
        
        if (playerToMove == player1) {
            int max = Integer.MIN_VALUE;
            int column = 0;
            for (int i = 0; i < board.columns; i++) {
                if (board.isLegalMove(i)) {
                    board.insertToken(i, player1);
                    int value = miniMaxValue(board, depth, player2);//recursive call
                    System.out.println("maximizer values " +value);
                    if (max < value) {
                        max = value;
                        column = i;
                    }
                    //debug statement
                    board.showBoard();
                    board.remove(i);
                }
            }
            maxColumn = column;
            //debug statement
            System.out.println("max "+ max);
            return max;
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < board.columns; i++) {
                if (board.isLegalMove(i)) {
                    board.insertToken(i, player2);
                    int value = miniMaxValue(board, depth, player1);
                    System.out.println("min values " + value);
                    if (min > value) {
                        min = value;
                    }
                    //debug statement
                    board.showBoard();
                    board.remove(i);
                }
            }
            //debug statement
            System.out.println("min "+ min);
            return min;
        }
    }
}

