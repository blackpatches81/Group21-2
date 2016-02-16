package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


/**
 * Created by nathan on 2/15/16.
 */
public class Deck {

    public java.util.List<Card> deck = new ArrayList<>();
    public void build(){
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }

    public void shuffle(){
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }

    public Card deal(){
        Card card = deck.get(deck.size() - 1);
        deck.remove(deck.size() - 1);
        return card;
    }
}
