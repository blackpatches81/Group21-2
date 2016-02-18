package models;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by nathan on 2/16/16.
 */
public class testEnDeck {

    @Test
    public void testDeckInitialization(){
        // Arrange
        Deck d = new EnDeck();

        // Act

        // Assert
        assertNotEquals(null, d);

    }

    @Test
    public void testBuildDeck(){
        // Arrange
        Deck d = new EnDeck();

        // Act
        d.build();

        // Assert
        assertNotEquals(null, d.deck);

    }

    @Test
    public void testShuffleDeck(){
        // Arrange
        Deck unshuffled = new EnDeck();
        Deck shuffeled = new EnDeck();

        // Act
        unshuffled.build();
        shuffeled.build();
        shuffeled.shuffle();

        // Assert
        assertNotEquals(unshuffled.deck, shuffeled.deck);

    }

    @Test
    public void testDrawCardFromDeck(){
        // Arrange
        Deck d = new EnDeck();
        Card cRec = null;

        // Act
        d.build();
        cRec = d.deal();

        // Assert
        assertNotEquals(null, cRec);
    }
}
