package models;

/**
 * Created by nathan on 2/17/16.
 */
public class EsDeck extends Deck {

    public void build(){
        for(int i = 1; i < 14; i++){
            if((i != 8) && (i != 9) && ( i != 10)){
                cards.add(new Card(i,Suit.Clubs));
                cards.add(new Card(i,Suit.Swords));
                cards.add(new Card(i,Suit.Coins));
                cards.add(new Card(i,Suit.Cups));
            }
        }

    }
}
