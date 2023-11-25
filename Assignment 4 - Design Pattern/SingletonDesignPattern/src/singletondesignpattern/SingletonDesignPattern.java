/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletondesignpattern;

/**
 *
 * @author shakeb
 */
public class SingletonDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleObject object = SingleObject.getInstance();
        //Get the only object available
        object.showMessage();

    }
    
}
