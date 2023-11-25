/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.Test;
import singletondesignpattern.SingleObject;
import static org.junit.Assert.*;
//import singletondesignpattern;

/**
 *
 * @author shakeb
 */
public class SingleObjectTest {
    
    public SingleObjectTest() {
    }
  
    /**
     * Test method for checking if the getInstance() method always returns the same instance of the SingleObject class.
     * This method gets two instances of the SingleObject class using the getInstance() method,
     * and finally, it checks if both instances are equal, meaning that they refer to the same object in memory.
     */
    @Test
    public void testInstance() {
        SingleObject obj1=SingleObject.getInstance();
        SingleObject obj2=SingleObject.getInstance();
        assertTrue(obj1.equals(obj2));
    }

    /**
     * Test of Message method, of class SingleObject.
     */
    @Test
    public void testMessage() {
    }

   
    /**
     * Test of Identifier method, of class SingleObject.
     */
    @Test
    public void testIdentifier() {
    }
}