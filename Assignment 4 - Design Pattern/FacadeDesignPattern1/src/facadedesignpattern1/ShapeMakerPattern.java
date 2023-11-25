/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern1;

/**
 *
 * @author shakeb
 */

/**
 * The ShapeMaker class represents a utility for drawing various shapes.
 * It uses instances of classes implementing the Shape interface to draw specific shapes.
 */
public class ShapeMakerPattern {
    
    // Attributes
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    /**
     * Constructs a ShapeMaker object and initializes instances of CirclePattern, RectanglePattern, and SquarePattern.
     */
    public ShapeMakerPattern() {
        circle = new CircleDesign();
        rectangle = new RectangleDesign();
        square = new SquareDesign();
    }

    /**
     * Draws a circle using the stored CirclePattern object.
     */
    public String drawCircle() {
       return circle.draw();
    }

    /**
     * Draws a rectangle using the stored RectanglePattern object.
     */
    public String drawRectangle() {
       return rectangle.draw();
    }

    /**
     * Draws a square using the stored SquarePattern object.
     */
    public String drawSquare() {
        return square.draw();
    }
}
