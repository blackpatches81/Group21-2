package models;

/**
 * Created by nathan on 2/17/16.
 */
public class EsDeck extends Deck {

    public void build(){
        for(int i = 1; i < 14; i++){
            if((i != 8) && (i != 9) && ( i != 10)){
                deck.add(new Card(i,Suit.Clubs));
                deck.add(new Card(i,Suit.Swords));
                deck.add(new Card(i,Suit.Coins));
                deck.add(new Card(i,Suit.Cups));
            }
        }

    }
}
