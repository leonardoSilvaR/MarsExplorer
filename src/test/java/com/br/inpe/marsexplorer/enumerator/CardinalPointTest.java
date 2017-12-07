package com.br.inpe.marsexplorer.enumerator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva@accurate.com.br>
 */
public class CardinalPointTest {
    
    public CardinalPointTest() {
    }

    /**
     * Test of values method, of class CardinalPoint.
     */
    @Test
    @Ignore
    public void testValues() {
        System.out.println("values");
        CardinalPoint[] expResult = null;
        CardinalPoint[] result = CardinalPoint.values();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class CardinalPoint.
     */
    @Test
    @Ignore
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        CardinalPoint expResult = null;
        CardinalPoint result = CardinalPoint.valueOf(name);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardinal method, of class CardinalPoint.
     */
    @Test
    @Ignore
    public void testGetCardinal() {
        System.out.println("getCardinal");
        CardinalPoint instance = null;
        CardinalPoint expResult = null;
        CardinalPoint result = instance.getCardinal();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCardinal method, of class CardinalPoint.
     */
    @Test
    @Ignore
    public void testSetCardinal() {
        System.out.println("setCardinal");
        CardinalPoint cardinal = null;
        CardinalPoint instance = null;
        instance.setCardinal(cardinal);
        fail("The test case is a prototype.");
    }
    
}
