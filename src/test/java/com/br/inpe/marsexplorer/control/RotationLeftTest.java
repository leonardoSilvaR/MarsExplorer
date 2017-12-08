package com.br.inpe.marsexplorer.control;

import com.br.inpe.marsexplorer.enumerator.CardinalPoint;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 */
public class RotationLeftTest {

    @Test
    public void testRotationNtoW() {
        CardinalPoint cardinalPoint = CardinalPoint.N;
        CardinalPoint expResult = CardinalPoint.W;
        CardinalPoint result = RotationLeft.rotation(cardinalPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRotationWtoS() {
        CardinalPoint cardinalPoint = CardinalPoint.W;
        CardinalPoint expResult = CardinalPoint.S;
        CardinalPoint result = RotationLeft.rotation(cardinalPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRotationStoE() {
        CardinalPoint cardinalPoint = CardinalPoint.S;
        CardinalPoint expResult = CardinalPoint.E;
        CardinalPoint result = RotationLeft.rotation(cardinalPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRotationEtoN() {
        CardinalPoint cardinalPoint = CardinalPoint.E;
        CardinalPoint expResult = CardinalPoint.N;
        CardinalPoint result = RotationLeft.rotation(cardinalPoint);
        assertEquals(expResult, result);
    }

}
