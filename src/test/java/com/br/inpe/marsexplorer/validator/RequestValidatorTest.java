package com.br.inpe.marsexplorer.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva@accurate.com.br>
 */
public class RequestValidatorTest {
    
    public RequestValidatorTest() {
    }

    /**
     * Test of validator method, of class Validator.
     */
    @Test
    @Ignore
    public void testValidator() {
        System.out.println("validator");
        String req = "";
        Boolean expResult = null;
        Boolean result = Validator.validator(req);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
