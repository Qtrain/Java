/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unfinishedProjects.connectfourclient;

import java.util.Scanner;

/**
 *
 * @author qtrain
 */
/**
 *
 * @author qtrain
 */
public class ConnectFourClient {

    public static BoardClass board = new BoardClass();
    public static MiniMax computerPlayer;
    public static char currentPlayer;
    public static char winner;

    private static void showResults() {
        if (winner == ' ') {
            System.out.println("It's a tie!");        
        } else {
            System.out.println("The " +winner+ " won.");
        }
    }

    public static void main(String[] args) {
       
        computerPlayer = new MiniMax();

        currentPlayer = 'X';
        do {
            int column;
            if (currentPlayer == 'O') {
                column = computerPlayer.miniMaxDecision(board);
            } else {
                System.out.println("enter a number");
                Scanner in = new Scanner(System.in);
                column = in.nextInt();
            }
            board.insertToken(column, currentPlayer);
            board.showBoard();
            //switch players
            if (currentPlayer == 'X'){
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
            //check for win
            winner = board.checkForWin();
        } while (winner == ' ' && !board.isTie());
        showResults();
    }
}

