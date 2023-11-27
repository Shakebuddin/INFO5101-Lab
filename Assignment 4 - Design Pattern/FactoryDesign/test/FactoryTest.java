/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import factorydesign.*;

/**
 *
 * @author lenovo
 */
public class FactoryTest {
    
    public FactoryTest() {
    }
    
    
    // Create an instance of ShapeFactory
    ShapeFactory sh = new ShapeFactory();
        
        
    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testCircle() {
        // Validate if the instance of Circle is returned when input is "circle"
        assertTrue(sh.getShape("circle") instanceof Circle);
    }
    
    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testRectangle() {
        // Validate if the instance of Rectangle is returned when input is "rectangle"
        assertTrue(sh.getShape("rectangle") instanceof Rectangle);
    }
    
    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testSquare() {
        // Validate if the instance of Square is returned when input is "square"
        assertTrue(sh.getShape("square") instanceof Square);
    }
}
