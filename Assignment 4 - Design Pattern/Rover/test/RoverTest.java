/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import rover.*;

/**
 *
 * @author lenovo
 */
public class RoverTest {
    
    Rover r = new Rover();
    
     /**
     * Tests the pressRightPedal method of the Rover class.
     * 
     * Test Cases:
     * 1. Rover should always start in "At Rest" state.
     *    Assertion: The current state should be "At Rest".
     * 
     * 2. When at rest, pressing right pedal twice should not move the rover.
     *    Assertion: The current state should remain "At Rest".
     * 
     * 3. When at rest, pressing right pedal once should move the rover.
     *    Assertion: The current state should be "Move Forward".
     */
    
    @Test
    public void testPressRightPedal() {
        
        // Test Case 1
        assertEquals("At Rest",r.currentState.name);
        
        // Test Case 2
        r.pressRightPedal(2);
        assertEquals("At Rest",r.currentState.name);
        
       // Test Case 3
        r.pressRightPedal(1);
        assertEquals("Move Forward",r.currentState.name);
        
    }

   /**
     * Placeholder method for testing the printStateAndSubState method of the Rover class.
     */
    
    @Test
    public void testPrintStateAndSubState() {
    }


    /**
     * Placeholder method for testing the main method of the Rover class.
     */
    
    @Test
    public void testMain() {
    }
}
