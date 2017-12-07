/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.inpe.marsexplorer.service;

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
     * Test of getExploration method, of class ExplorerService.
     */
    @Test
    @Ignore
    public void testGetExploration() {
        System.out.println("getExploration");
        String command = "";
        ExplorerService instance = new ExplorerService();
        Kepler186F expResult = null;
        Kepler186F result = instance.getExploration(command);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
