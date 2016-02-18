package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/25/16.
 */
public class testGame {

    @Test
    public void testGameCreation(){
        Game g = new Game();
        assertNotNull(g);
    }

    @Test
    public void testGameBuildDeck(){
        // arrange
        Game g = new Game();

        // act

        // assert
        assertEquals(52,g.deck.cards.size());
    }

    @Test
    public void testGameDeckShuffle(){
        // arrange
        Game g = new Game();
        Card cRec;

        // act
        g.deck.shuffle();
        cRec = g.deck.deal();

        // assert
        assertNotEquals("14Spades", cRec.toString());
    }

    @Test
    public void testGameInit(){

        // arrange
        Game g = new Game();
        Card cRec;

        // act
        g.deck.shuffle();
        cRec = g.deck.deal();

        // assert
        assertNotEquals(13,cRec.getValue());
    }

    @Test
    public void testGameStart(){

        // arrange
        Game g = new Game();

        // act
        g.dealFour();

        // assert
        assertEquals(1,g.cols.get(0).size());
        assertEquals("14Spades",g.cols.get(0).get(0).toString());
        assertEquals(1,g.cols.get(1).size());
        assertEquals("14Diamonds",g.cols.get(1).get(0).toString());
        assertEquals(1,g.cols.get(2).size());
        assertEquals("14Hearts",g.cols.get(2).get(0).toString());
        assertEquals(1,g.cols.get(3).size());
        assertEquals("14Clubs",g.cols.get(3).get(0).toString());
    }

    @Test
    public void testCustomDeal(){

        // arrange
        Game g = new Game();

        // act
        g.customDeal(0,3,6,9);

        // assert
        assertEquals("2Clubs",g.cols.get(0).get(0).toString());
        assertEquals("3Clubs",g.cols.get(1).get(0).toString());
        assertEquals("4Clubs",g.cols.get(2).get(0).toString());
        assertEquals("5Clubs",g.cols.get(3).get(0).toString());
    }

    @Test
    public void testRemove(){
        // arrange
        Game g = new Game();

        // act
        g.customDeal(0,3,6,9);
        g.remove(2);

        // assert
        assertEquals(0,g.cols.get(2).size());
    }

    @Test
    public void testMove(){
        // arrange
        Game g = new Game();

        // act
        g.dealFour();
        g.move(0,3);

        // assert
        assertEquals(0, g.cols.get(0).size());
        assertEquals(2, g.cols.get(3).size());



    }



}
