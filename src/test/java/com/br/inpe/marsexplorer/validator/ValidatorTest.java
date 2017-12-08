package com.br.inpe.marsexplorer.validator;

import com.br.inpe.marsexplorer.enumerator.CardinalPoint;
import com.br.inpe.marsexplorer.model.Kepler186F;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 */
public class ValidatorTest {

    Kepler186F robot;

    @Before
    public void setUp() {
        robot = new Kepler186F();
        robot.initialLocation();
    }

    @Test
    public void testRequestValidatorNumber() {
        String command= "1188";
        assertEquals(false, Validator.requestValidator(command));

    }
    
    @Test
    public void testRequestValidatorUnknowCommand() {
        String command= "MMRRAB";
        assertEquals(false, Validator.requestValidator(command));

    }

    @Test
    public void testGroundMaxYValue() {
        robot.setCardinal(CardinalPoint.N);
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        assertEquals(false, Validator.groundValidator(robot));
    }

    @Test
    public void testGroundMaxXValue() {
        robot.setCardinal(CardinalPoint.E);
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        assertEquals(false, Validator.groundValidator(robot));
    }

    @Test
    public void testGroundMinYValue() {
        robot.setCardinal(CardinalPoint.S);
        robot.move();
        robot.move();
        robot.move();
        assertEquals(false, Validator.groundValidator(robot));

    }

    @Test
    public void testGroundMinXValue() {
        robot.setCardinal(CardinalPoint.W);
        robot.move();
        robot.move();
        robot.move();
        assertEquals(false, Validator.groundValidator(robot));
    }

}
