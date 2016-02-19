package models;

/**
 * Created by nathan on 2/16/16.
 */
public class EnDeck extends Deck {

    public void build() {
        for(int i = 2; i < 15; i++){
            cards.add(new Card(i,Suit.Clubs));
            cards.add(new Card(i,Suit.Hearts));
            cards.add(new Card(i,Suit.Diamonds));
            cards.add(new Card(i,Suit.Spades));
        }
    }
}
