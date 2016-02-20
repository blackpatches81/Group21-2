package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by michaelhilton on 1/25/16.
 */
public class Game {
    public Deck deck;

    public java.util.List<java.util.List<Card>> cols = new ArrayList<>();


    public Game(){
        deck = new EnDeck();
        deck.build();

        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
    }

    public Game(String deckType)
    {
        if (deckType == "es") {
            deck = new EsDeck();
            deck.build();
        }
        else {
            deck = new EnDeck();
            deck.build();
        }

        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
    }

    public void dealFour() {
        for(int i = 0; i < 4; i++){
            cols.get(i).add(deck.deal());
        }
    }

    //customDeal to setup game for testing purposes
    public void customDeal(int c1, int c2, int c3, int c4) {
        cols.get(0).add(deck.cards.get(c1));
        deck.cards.remove(c1);
        cols.get(1).add(deck.cards.get(c2));
        deck.cards.remove(c2);
        cols.get(2).add(deck.cards.get(c3));
        deck.cards.remove(c3);
        cols.get(3).add(deck.cards.get(c4));
        deck.cards.remove(c4);
    }

    public void remove(int columnNumber) {
        if(colHasCards(columnNumber)) {
            Card c = getTopCard(columnNumber);
            boolean removeCard = false;
            for (int i = 0; i < 4; i++) {
                if (i != columnNumber) {
                    if (colHasCards(i)) {
                        Card compare = getTopCard(i);
                        if (compare.getSuit() == c.getSuit()) {
                            if (compare.getValue() > c.getValue()) {
                                removeCard = true;
                            }
                        }
                    }
                }
            }
            if (removeCard) {
                this.cols.get(columnNumber).remove(this.cols.get(columnNumber).size() - 1);
            }
        }
    }

    public void move(int colFrom, int colTo) {
        Card cardToMove = getTopCard(colFrom);
        this.removeCardFromCol(colFrom);
        this.addCardToCol(colTo,cardToMove);
    }

    private boolean colHasCards(int colNumber) {
        if(this.cols.get(colNumber).size()>0){
            return true;
        }
        return false;
    }

    private Card getTopCard(int columnNumber) {
        return this.cols.get(columnNumber).get(this.cols.get(columnNumber).size()-1);
    }

    private void addCardToCol(int colTo, Card cardToMove) {
        cols.get(colTo).add(cardToMove);
    }

    private void removeCardFromCol(int colFrom) {
        this.cols.get(colFrom).remove(this.cols.get(colFrom).size()-1);
    }
}
