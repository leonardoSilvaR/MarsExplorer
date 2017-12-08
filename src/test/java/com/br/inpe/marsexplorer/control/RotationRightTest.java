package com.br.inpe.marsexplorer.control;

import com.br.inpe.marsexplorer.enumerator.CardinalPoint;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 */
public class RotationRightTest {

    @Test
    public void testRotationNtoE() {
        CardinalPoint cardinalPoint = CardinalPoint.N;
        CardinalPoint expResult = CardinalPoint.E;
        CardinalPoint result = RotationRight.rotation(cardinalPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRotationEtoS() {
        CardinalPoint cardinalPoint = CardinalPoint.E;
        CardinalPoint expResult = CardinalPoint.S;
        CardinalPoint result = RotationRight.rotation(cardinalPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRotationStoW() {
        CardinalPoint cardinalPoint = CardinalPoint.S;
        CardinalPoint expResult = CardinalPoint.W;
        CardinalPoint result = RotationRight.rotation(cardinalPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRotationWtoN() {
        CardinalPoint cardinalPoint = CardinalPoint.W;
        CardinalPoint expResult = CardinalPoint.N;
        CardinalPoint result = RotationRight.rotation(cardinalPoint);
        assertEquals(expResult, result);
    }
}
