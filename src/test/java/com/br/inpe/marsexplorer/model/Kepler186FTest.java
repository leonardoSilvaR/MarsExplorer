package com.br.inpe.marsexplorer.model;

import com.br.inpe.marsexplorer.enumerator.CardinalPoint;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 */
public class Kepler186FTest {

    Kepler186F robot;

    @Before
    public void setUp() {
        robot = new Kepler186F();

    }

    @Test
    public void testInitialLocation() {
        robot.initialLocation();
        Kepler186F expected = new Kepler186F();
        expected.setCardinal(CardinalPoint.N);
        expected.setCoordinates(new Coordinates(0, 0));
        assertEquals(expected.toString(), robot.toString());

    }

    @Test
    public void testMoveWithoutInicialLocation() {
        Kepler186F expected = new Kepler186F();
        expected.setCardinal(null);
        expected.setCoordinates(null);
        assertEquals(expected.toString(), robot.toString());
    }

    @Test
    public void testMoveToSouth() {
        robot.initialLocation();
        robot.setCardinal(CardinalPoint.S);
        robot.move();
        robot.move();
        Kepler186F expected = new Kepler186F();
        expected.setCardinal(CardinalPoint.S);
        expected.setCoordinates(new Coordinates(0, 0));
        expected.move();
        expected.move();
        assertEquals(expected.toString(), robot.toString());
    }

    @Test
    public void testMoveToWest() {
        robot.initialLocation();
        robot.setCardinal(CardinalPoint.W);
        robot.move();
        robot.move();
        Kepler186F expected = new Kepler186F();
        expected.setCardinal(CardinalPoint.W);
        expected.setCoordinates(new Coordinates(0, 0));
        expected.move();
        expected.move();
        assertEquals(expected.toString(), robot.toString());
    }

    @Test
    public void testMoveToEast() {
        robot.initialLocation();
        robot.setCardinal(CardinalPoint.E);
        robot.move();
        robot.move();
        Kepler186F expected = new Kepler186F();
        expected.setCardinal(CardinalPoint.E);
        expected.setCoordinates(new Coordinates(0, 0));
        expected.move();
        expected.move();
        assertEquals(expected.toString(), robot.toString());
    }

    @Test
    public void testMoveToNorth() {
        robot.initialLocation();
        robot.setCardinal(CardinalPoint.N);
        robot.move();
        robot.move();

        Kepler186F expected = new Kepler186F();
        expected.setCardinal(CardinalPoint.N);
        expected.setCoordinates(new Coordinates(0, 0));
        expected.move();
        expected.move();

        assertEquals(expected.toString(), robot.toString());
    }

}
