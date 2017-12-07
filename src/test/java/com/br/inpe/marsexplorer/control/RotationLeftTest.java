package com.br.inpe.marsexplorer.control;

import com.br.inpe.marsexplorer.control.RotationLeft;
import com.br.inpe.marsexplorer.enumerator.CardinalPoint;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com.br>
 * @since 07/12/2017
 * @version 1.0
 */
public class RotationLeftTest {

    @Test
    public void rotationNorthToWest() {
        assertEquals(CardinalPoint.W, RotationLeft.rotation(CardinalPoint.N));
    }

    @Test
    public void rotationWestToSouth() {
        assertEquals(CardinalPoint.S, RotationLeft.rotation(CardinalPoint.W));
    }

    @Test
    public void rotationSouthToEast() {
        assertEquals(CardinalPoint.E, RotationLeft.rotation(CardinalPoint.S));
    }

    @Test
    public void rotationEastToNorth() {
        assertEquals(CardinalPoint.N, RotationLeft.rotation(CardinalPoint.E));
    }

}
