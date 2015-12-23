/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinflip;

import java.util.Arrays;

/**
 *
 * @author qtrain
 */
public class CoinFlip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int bank = 500;
        int headsCount=0;
        int tailsCount=0;
        int winCounter=0;
        int lossCounter=0;
        String bet;
        String printCoin;

        String[] flipResults = new String[100];
        ComputerPlayer randomPlayer = new ComputerPlayer();
        Coin coin = new Coin();
        for (int i = 0; i < 100; i++) {
            
            bet = randomPlayer.placeRandomBet();
            System.out.println("bet " +bet);
            printCoin = coin.flip();
            System.out.println("coin flip "+ printCoin);
            flipResults[i] = printCoin;
            if(flipResults[i].equals("heads")){
                headsCount += 1;
            }
            else{
                tailsCount +=1;
            }
            if(flipResults[i].equals(bet)){
                bank += 50;
                winCounter+=1;
            }
            if(!flipResults[i].equals(bet)){
                bank -=50;
                lossCounter+=1;
        }
        System.out.println(Arrays.toString(flipResults));
        System.out.println("heads count " +headsCount);
        System.out.println("tails count " +tailsCount);
        System.out.println(bank);
        System.out.println("win counter " +winCounter);
        System.out.println("loss counter" +lossCounter);
    }
    }
    public static class ComputerPlayer{
        
        int Bank = 500;
        double bet;
        String heads = "heads";
        String tails = "tails";
        
        public ComputerPlayer(){}
        
        public String placeRandomBet(){
            bet = Math.random();
            if(bet < .5){
                return heads;
            }
            else return tails;
        
        }
//        
//        public static String placeLearnedBet(int wins; int losses){
//            
//        
//        
//        }
    
    }

    public static class Coin {

        double coin;
        String heads = "heads";
        String tails = "tails";

        public String flip() {
            if (Math.random() < .9) {
                return heads;
            } else {
                return tails;
            }
        }

    }
}
