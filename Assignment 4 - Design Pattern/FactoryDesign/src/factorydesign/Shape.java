/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factorydesign;

/**
 *
 * @author shakeb
 * The Shape interface represents a geometric shape that can be drawn.
 * It defines a single method, draw(), that concrete implementations must implement
 * to provide specific behaviors for drawing different shapes.
 */
public interface Shape {
   /**
     * 
     * Draws the specific shape.
     * Concrete implementations must provide the actual drawing behavior.
     * 
     * This method does not take any parameters as it is intended to be implemented
     * by concrete classes to define their unique drawing logic.
     * 
     * The method does not return any value (`void`), as it is meant to perform
     * an action (drawing) rather than producing a result.
     * 
     */
    void draw(); 
}
