/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadedesignpattern1;

/**
 *
 * @author shakeb
 * 
 *The main method demonstrates the Facade design pattern by creating a ShapeMakerPattern object
  and using its simplified interface to draw a circle, rectangle, and square.
 */
public class FacadeDesignPattern1 {

    /**
     * The main method demonstrates the Facade design pattern by creating a ShapeMakerPattern object
       and using its simplified interface to draw a circle, rectangle, and square.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a ShapeMakerPattern object
        ShapeMakerPattern shapeMaker = new ShapeMakerPattern();

        // Draw a circle using the simplified interface
        shapeMaker.drawCircle();

        // Draw a rectangle using the simplified interface
        shapeMaker.drawRectangle();

        // Draw a square using the simplified interface
        shapeMaker.drawSquare();
    }
    
}
