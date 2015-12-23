/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unfinishedProjects.connectfourclient;

/**
 *
 * @author qtrain
 */
public class BoardClass {
    
    protected int rows = 6;
    protected int columns = 7;
    protected char board[][] = new char[rows][columns];
    /**
     * The evaluation table is determined by the number of possible ways to make
     * connect 4 from any given spot on the board. i.e. from the top left corner
     * you can make connect four by going down, across or one diagonal. In the
     * second spot over (where the four is) you could use the same methods as
     * the top right corner plus one additional horizontal connect four starting
     * where the 4 is located. And so on..
     */
    private static int[][] evaluationTable = {{3, 4, 5, 7, 5, 4, 3},
                                            {4, 6, 8, 10, 8, 6, 4},
                                            {5, 8, 11, 13, 11, 8, 5},
                                            {5, 8, 11, 13, 11, 8, 5},
                                            {4, 6, 8, 10, 8, 6, 4},
                                            {3, 4, 5, 7, 5, 4, 3}};

    //constructor
    public BoardClass() {
        initializeBoard();
        showBoard();
    }

    /**
     * This method implements the evaluation function by taking into account the
     * two-dimensional array evaluationTable. Utility is determined by the sum
     * of all the values in the evaluation table (276) divided by two (b/c two
     * players) i.e. the most spaces one player could occupy is half the spots
     */
    public int evaluateContent() {
        int utility = 138;
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] == 'X') {
                    sum += evaluationTable[i][j];
                } else if (board[i][j] == 'O') {
                    sum -= evaluationTable[i][j];
                }
            }
        }
        return utility + sum;
    }

    public void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void showBoard() {
        System.out.println(" 0  1  2  3  4  5  6");
        System.out.println("______________________");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("______________________");
    }

    public boolean insertToken(int column, char currentPlayer) {
        if (column > 6 || column < 0 || board[0][column] != ' ') {
            return false;
        } else {
            for (int i = rows - 1; i >= 0; i--) {
                if (board[i][column] == ' ') {
                    board[i][column] = currentPlayer;
                    break;
                }
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

    public char checkForWin() {
        //check for win horizontally
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns - 3; j++) {
                if (board[i][j] != ' '
                        && board[i][j] == board[i][j + 1]
                        && board[i][j] == board[i][j + 2]
                        && board[i][j] == board[i][j + 3]) {
                    return board[i][j];
                }
            }
        }
        //check for win vertically
        for (int i = 0; i < rows - 3; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] != ' '
                        && board[i][j] == board[i + 1][j]
                        && board[i][j] == board[i + 2][j]
                        && board[i][j] == board[i + 3][j]) {
                    return board[i][j];
                }
            }
        }
        //check for win diagonally (upper left to lower right)
        for (int i = 0; i < rows - 3; i++) {
            for (int j = 0; j < columns - 3; j++) {
                if (board[i][j] != ' '
                        && board[i][j] == board[i + 1][j + 1]
                        && board[i][j] == board[i + 2][j + 2]
                        && board[i][j] == board[i + 3][j + 3]) {
                    return board[i][j];
                }
            }
        }
        //check for win diagonally (lower left to upper right)
        for (int i = 3; i < rows; i++) {
            for (int j = 0; j < columns - 3; j++) {
                if (board[i][j] != ' '
                        && board[i][j] == board[i - 1][j + 1]
                        && board[i][j] == board[i - 2][j + 2]
                        && board[i][j] == board[i - 3][j + 3]) {
                    return board[i][j];
                }
            }
        }
        return ' ';
    }

    public boolean isTie() {
        for (int j = 0; j < columns; j++) {
            if (board[0][j] == ' ') {
                return false;
            }
        }
        return true;
    }

    public boolean isLegalMove(int column) {
        if (column < 0 || column > 6 || board[0][column] != ' ') {
            return false;
        }
        return true;
    }
}


