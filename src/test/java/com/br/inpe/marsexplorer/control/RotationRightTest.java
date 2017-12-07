package com.br.inpe.marsexplorer.control;

import com.br.inpe.marsexplorer.control.RotationRight;
import com.br.inpe.marsexplorer.enumerator.CardinalPoint;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com.br>
 * @since 07/12/2017
 * @version 1.0
 */
public class RotationRightTest {
    
    @Test
    public void rotationNorthToEast() {
        assertEquals(CardinalPoint.E, RotationRight.rotation(CardinalPoint.N));
    }

    @Test
    public void rotationEastToSouth() {
        assertEquals(CardinalPoint.S, RotationRight.rotation(CardinalPoint.E));
    }

    @Test
    public void rotationSouthToWest() {
        assertEquals(CardinalPoint.W, RotationRight.rotation(CardinalPoint.S));
    }

    @Test
    public void rotationWestToNorth() {
        assertEquals(CardinalPoint.N, RotationRight.rotation(CardinalPoint.W));
    }

}
