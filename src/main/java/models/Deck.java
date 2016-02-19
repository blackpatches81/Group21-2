package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


/**
 * Created by nathan on 2/15/16.
 */
public abstract class Deck {

    public java.util.List<Card> cards = new ArrayList<>();

    public abstract void build();

    public void shuffle(){
        long seed = System.nanoTime();
        Collections.shuffle(cards, new Random(seed));
    }

    public Card deal(){
        Card card = cards.get(cards.size() - 1);
        cards.remove(cards.size() - 1);
        return card;
    }

}
