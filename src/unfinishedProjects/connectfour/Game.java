/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unfinishedProjects.connectfour;

import javax.swing.JOptionPane;

public class Game {

    public static Board board = new Board();
    public static ComputerPlayer computer;
    public static char currentPlayer;
    public static char winner;

    public static void changePlayer() {
        if (currentPlayer == 'O') {
            currentPlayer = 'X';
        } else {
            currentPlayer = 'O';
        }
    }

    private static void showWinner() {
        if (winner == ' ') {
            JOptionPane.showMessageDialog(null, "Nobody won!");
        } else {
            JOptionPane.showMessageDialog(null, "Player " + winner + " won!");
        }
    }

    public static void main(String[] args) {
        int option = Integer.parseInt(JOptionPane.showInputDialog("Select search algorithm (1:Minimax, 2:alpha-beta)"));
        int limit = Integer.parseInt(JOptionPane.showInputDialog("Insert cutoff limit (1-8)"));
        computer = new ComputerPlayer(limit);
        ComputerPlayer computer2 = new ComputerPlayer(limit);
		//char answer = JOptionPane.showInputDialog("Do you want to start (y/n)?").charAt(0);
        //if (answer == 'y')
        //	currentPlayer = 'X';
        //else currentPlayer = 'O';
        for (int i = 0; i < 10; i++) {
            currentPlayer = 'O';
            do {
                int column;
                if (currentPlayer == 'X') {
                    if (option == 1) {
                        column = computer.miniMaxDecision(board);
                    } else {
                        column = computer.miniMaxDecision(board);
                    }
                } else {
                    column = computer2.miniMaxDecision(board);
                }
                //column = Integer.parseInt(JOptionPane.showInputDialog("Insert a column"));
                while (!board.insert(column, currentPlayer)) {
                    column = computer2.miniMaxDecision(board);
                }
                //column = Integer.parseInt(JOptionPane.showInputDialog("Insert a column"));
                board.showContent();
                changePlayer();
                winner = board.isFinished();
            } while (winner == ' ' && !board.isTie());
            showWinner();
        }
    }
}
