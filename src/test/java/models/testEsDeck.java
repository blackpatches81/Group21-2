package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nathan on 2/17/16.
 */
public class testEsDeck {

    @Test
    public void testDeckInitialization(){
        // Arrange
        Deck d = new EsDeck();

        // Act

        // Assert
        assertNotEquals(null, d);

    }

    @Test
    public void testBuildDeck(){
        // Arrange
        Deck d = new EsDeck();

        // Act
        d.build();

        // Assert
        assertNotEquals(null, d.cards);
        assertEquals(40, d.cards.size());

    }

    @Test
    public void testShuffleDeck(){
        // Arrange
        Deck unshuffled = new EsDeck();
        Deck shuffeled = new EsDeck();

        // Act
        unshuffled.build();
        shuffeled.build();
        shuffeled.shuffle();

        // Assert
        assertNotEquals(unshuffled.cards, shuffeled.cards);

    }

    @Test
    public void testDrawCardFromDeck(){
        // Arrange
        Deck d = new EsDeck();
        Card cRec = null;
        Card cExp = new Card(13,Suit.Cups);

        // Act
        d.build();
        cRec = d.deal();

        // Assert
        assertNotEquals(null, cRec);
        assertEquals(cExp.toString(),cRec.toString());
    }
}
