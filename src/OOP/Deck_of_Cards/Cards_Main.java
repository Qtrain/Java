package OOP.Deck_of_Cards;

/**
 * Created by macbook on 9/12/15.
 */


import java.util.*;

public class Cards_Main {
    public static void main(String[] args) {
        Deck deck = new Deck();


                for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
                    for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                        Card card = deck.getCard(suit, rank);
                        System.out.format("%s of %s%n",
                                card.rankToString(card.getRank()),
                                card.suitToString(card.getSuit()));
                    }
                }
            }
        }



