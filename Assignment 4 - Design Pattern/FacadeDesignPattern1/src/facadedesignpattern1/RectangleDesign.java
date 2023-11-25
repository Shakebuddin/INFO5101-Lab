/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern1;

/**
 *
 * @author shakeb
 * 
 *  The RectanglePattern class represents a rectangular shape that can be drawn.
    It implements the Shape interface, providing a specific implementation
    for drawing a rectangle.
 */
public class RectangleDesign implements Shape{
    
    /**
     * Draws a rectangle by printing a message to the console.
     * This method is part of the Shape interface implementation.
     */
    @Override
    public  String draw() {
        System.out.println("Rectangle::draw()");
        return null;
    }
    
}
