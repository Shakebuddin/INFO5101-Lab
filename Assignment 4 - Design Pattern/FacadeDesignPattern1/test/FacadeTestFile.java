/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import facadedesignpattern1.*;

/**
 *
 * @author lenovo
 */
public class FacadeTestFile {
    
    public FacadeTestFile() {
    }
    
    // Create an instance of ShapeMaker to use its methods for testing
    ShapeMakerPattern shapeMaker = new ShapeMakerPattern();
  
    /**
     * This test method is designed to test the drawing functionality of the Circle class.
     * It creates an instance of Circle and compares its draw method's output with the expected
     * output obtained from the ShapeMaker's drawCircle method.
     */
    @Test
    public void testingCircle() {
        // Create an instance of Circle
        CircleDesign cl = new CircleDesign();

        // Assert that the draw method of Circle produces the expected output from ShapeMaker
        assertEquals(cl.draw(), shapeMaker.drawCircle());
    }

    /**
     * This test method is responsible for testing the drawing functionality of the Rectangle class.
     * It creates an instance of Rectangle and compares its draw method's output with the expected
     * output obtained from the ShapeMaker's drawRectangle method.
     */
    @Test
    public void testingRectangle() {
        // Create an instance of Rectangle
        RectangleDesign rect = new RectangleDesign();

        // Assert that the draw method of Rectangle produces the expected output from ShapeMaker
        assertEquals(rect.draw(), shapeMaker.drawRectangle());
    }

    /**
     * This test method is designed to test the drawing functionality of the Square class.
     * It creates an instance of Square and compares its draw method's output with the expected
     * output obtained from the ShapeMaker's drawSquare method.
     */
    @Test
    public void testingSquare() {
        // Create an instance of Square
        SquareDesign sq = new SquareDesign();

        // Assert that the draw method of Square produces the expected output from ShapeMaker
        assertEquals(sq.draw(), shapeMaker.drawSquare());
    }

    
}
