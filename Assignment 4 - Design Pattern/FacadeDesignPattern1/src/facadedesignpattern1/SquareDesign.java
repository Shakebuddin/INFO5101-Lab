/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpattern1;

/**
 *
 * @author shakeb
 *
 * The SquarePattern class represents a square shape that can be drawn.
 It implements the Shape interface, providing a specific implementation
 for drawing a square.
 *
 */
public class SquareDesign implements Shape{
    /**
     * Draws a square by printing a message to the console.
     * This method is part of the Shape interface implementation.
     */
    @Override
    public String draw() {
        System.out.println("Square::draw()");
        return null;
    }
    
}
