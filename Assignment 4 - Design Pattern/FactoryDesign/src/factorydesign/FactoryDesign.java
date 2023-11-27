/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorydesign;

/**
 *
 * @author shakeb
 */
public class FactoryDesign {

    /**
     * The main method of the FactoryPatternDemo class.
     * It creates a ShapeFactory, obtains instances of Circle, Rectangle, and Square,
     * and calls their draw methods to display their respective drawings.
     *
     * @param args Command line arguments (not used in this demo).
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
    
}
