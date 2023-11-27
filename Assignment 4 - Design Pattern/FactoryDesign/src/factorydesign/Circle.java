/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesign;

/**
 *
 * @author shakeb
 * The Circle class represents a circular shape that can be drawn.
 * It implements the Shape interface, providing a specific implementation
 * for drawing a circle.
 */
public class Circle implements Shape{
    /**
     * Draws a circle by printing a message to the console.
     * This method is part of the Shape interface implementation.
     * It provides a specific behavior for drawing a circle.
     * No parameters are required for this method.
     */
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
    
}
