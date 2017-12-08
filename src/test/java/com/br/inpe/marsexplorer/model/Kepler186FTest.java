package com.br.inpe.marsexplorer.model;

import com.br.inpe.marsexplorer.enumerator.CardinalPoint;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva@accurate.com.br>
 */
public class Kepler186FTest {
    
    public Kepler186FTest() {
    }

    /**
     * Test of initialLocation method, of class Kepler186F.
     */
    @Test
    @Ignore
    public void testInitialLocation() {
        System.out.println("initialLocation");
        Kepler186F instance = new Kepler186F();
        Kepler186F expResult = null;
        Kepler186F result = instance.initialLocation();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Kepler186F.
     */
    @Test
    @Ignore
    public void testMove() {
        System.out.println("move");
        int move = 0;
        Kepler186F instance = new Kepler186F();
        Kepler186F expResult = null;
        Kepler186F result = instance.move(move);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoordinates method, of class Kepler186F.
     */    
    @Test
    @Ignore
    public void testGetCoordinates() {
        System.out.println("getCoordinates");
        Kepler186F instance = new Kepler186F();
        Coordinates expResult = null;
        Coordinates result = instance.getCoordinates();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoordinates method, of class Kepler186F.
     */
    @Test
    @Ignore
    public void testSetCoordinates() {
        System.out.println("setCoordinates");
        Coordinates coordinates = null;
        Kepler186F instance = new Kepler186F();
        instance.setCoordinates(coordinates);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardinal method, of class Kepler186F.
     */
    @Test
    @Ignore
    public void testGetCardinal() {
        System.out.println("getCardinal");
        Kepler186F instance = new Kepler186F();
        CardinalPoint expResult = null;
        CardinalPoint result = instance.getCardinal();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCardinal method, of class Kepler186F.
     */
    @Test
    @Ignore
    public void testSetCardinal() {
        System.out.println("setCardinal");
        CardinalPoint cardinal = null;
        Kepler186F instance = new Kepler186F();
        instance.setCardinal(cardinal);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Kepler186F.
     */
    @Test
    @Ignore
    public void testToString() {
        System.out.println("toString");
        Kepler186F instance = new Kepler186F();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
