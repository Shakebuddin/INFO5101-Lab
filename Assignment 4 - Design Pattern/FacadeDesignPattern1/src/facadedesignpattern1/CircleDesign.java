/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern1;

/**
 *
 * @author shakeb
 * 
 * The CirclePattern class represents a circular shape that can be drawn.
   It implements the Shape interface, providing a specific implementation
   for drawing a circle.
 */
public class CircleDesign implements Shape {
    
    /**
     * Draws a circle by printing a message to the console.
     * This method is part of the Shape interface implementation.
     */
    @Override
    public String draw() {
        System.out.println("Circle::draw()");
        return null;
    }
}
