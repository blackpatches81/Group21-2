package models;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by nathan on 2/15/16.
 */
public class testDeck {

    @Test
    public void buildDeck(){
        // Arrange
        Deck d = new Deck();

        // Act
        d.build();

        // Assert
        assertNotEquals(null, d.deck);

    }

    @Test
    public void shuffleDeck(){
        // Arrange
        Deck unshuffled = new Deck();
        Deck shuffeled = new Deck();

        // Act
        unshuffled.build();
        shuffeled.build();

        shuffeled.shuffle();

        // Assert
        assertNotEquals(unshuffled.deck, shuffeled.deck);

    }

    @Test
    public void drawCardFromDeck(){
        // Arrange
        Deck d = new Deck();
        Card cRec = null;

        // Act
        d.build();
        cRec = d.deal();


        // Assert
        assertNotEquals(null, cRec);
    }
}

