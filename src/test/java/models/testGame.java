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
    public void testGameCreationEsDeck(){
        Game g = new Game("es");
        assertNotNull(g);
    }

    @Test
    public void testGameCreationEnDeck(){
        Game g = new Game("en");
        assertNotNull(g);
    }

    @Test
    public void testGameBuildDeck(){
        Game g = new Game();
        assertEquals(52,g.deck.cards.size());
    }

    @Test
    public void testGameInit(){
        Game g = new Game();
        g.deck.build();
        g.deck.shuffle();
        assertNotEquals(2,g.deck.cards.get(0).getValue());
    }

    @Test
    public void testGameStart(){
        Game g = new Game();
        g.deck.build();
        g.deck.shuffle();
        g.dealFour();
        assertEquals(1,g.cols.get(0).size());
        assertEquals(1,g.cols.get(1).size());
        assertEquals(1,g.cols.get(2).size());
        assertEquals(1,g.cols.get(3).size());
    }

    @Test
    public void testCustomDeal(){
        Game g = new Game();
        g.deck.build();
        g.customDeal(0,3,6,9);
        assertEquals("2Clubs",g.cols.get(0).get(0).toString());
        assertEquals("3Clubs",g.cols.get(1).get(0).toString());
        assertEquals("4Clubs",g.cols.get(2).get(0).toString());
        assertEquals("5Clubs",g.cols.get(3).get(0).toString());
    }

    @Test
    public void testRemoveFunction(){
        Game g = new Game();
        g.deck.build();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
    }



}
