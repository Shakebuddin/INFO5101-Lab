/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package facadedesignpattern1;

/**
 *
 * @author shakeb
 * 
 * The Shape interface represents a generic shape that can be drawn.
 * Classes implementing this interface are expected to provide specific
 * implementations for the draw() method, defining how the shape is drawn.
 */
public interface Shape {
    
    /**
     * Draws the shape. Classes implementing this method should provide
     * specific details on how the shape is drawn.
     */
    String draw();
    
}
