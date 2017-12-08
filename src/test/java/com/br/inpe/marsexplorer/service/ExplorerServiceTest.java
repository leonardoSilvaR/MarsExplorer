/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.inpe.marsexplorer.service;

import com.br.inpe.marsexplorer.enumerator.CardinalPoint;
import com.br.inpe.marsexplorer.model.Coordinates;
import com.br.inpe.marsexplorer.service.impl.Kepler186FServiceImpl;
import com.br.inpe.marsexplorer.model.Kepler186F;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva@accurate.com.br>
 */
public class ExplorerServiceTest {
    
    public ExplorerServiceTest() {
    }

    /**
     * Test of getExploration method, of class Kepler186FServiceImpl.
     */
    @Test
    @Ignore
    public void testGetExploration() {
        System.out.println("getExploration");
        String command = "MML";
        Kepler186FServiceImpl instance = new Kepler186FServiceImpl();
        Coordinates coor = new Coordinates(0, 2);
        
        Kepler186F expResult = new Kepler186F();
        expResult.setCardinal(CardinalPoint.N);
        expResult.setCoordinates(coor);
        
        Kepler186F result = instance.getExploration(command);
        System.out.println("RESULT>> "+result);
        
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
