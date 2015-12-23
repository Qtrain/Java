package Arrays;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qtrain
 */
public class MultiDimensionalArray {

    public static void main(String[] args) {
        int[][] gameboard = new int[4][4];
        
        for (int i = 0; i < gameboard.length; i++) {
            System.out.println("-------------------------------");
            for (int j = 0; j < gameboard[i].length; j++) {
                
                System.out.printf("%6d", gameboard[i][j]);
                if (j < gameboard[i].length - 1) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }

    }
}
