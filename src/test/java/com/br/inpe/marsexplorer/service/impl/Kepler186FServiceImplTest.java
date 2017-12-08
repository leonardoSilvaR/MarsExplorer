package com.br.inpe.marsexplorer.service.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 */
public class Kepler186FServiceImplTest {

    Kepler186FServiceImpl impl;

    @Before
    public void setUp() {
        impl = new Kepler186FServiceImpl();

    }

    @Test
    public void testGetExploration() {
        String command = "MMLRMMR";
        assertEquals(true, impl.getExploration(command));
    }

    @Test
    public void testGetExplorationUnknowCommand() {
        String command = "MMLRMMRA";
        assertEquals(false, impl.getExploration(command));
    }

    @Test
    public void testGetExplorationGround() {
        String command = "MMLRMMRMMMMMMMMMMMMMMMM";
        assertEquals(false, impl.getExploration(command));
    }

}
