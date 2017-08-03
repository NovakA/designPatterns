/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.AbstractFactory;

import creational.Factory.Shape;

/**
 *
 * @author Adam
 */
public class ColorAbstractFactory extends AbstractFactory {

    public ColorAbstractFactory() {
    }

    @Override
    Color getColor(String color) {
        if (color == null) return null;
        
        if (color.equals("red")) return new Red();
        else if (color.equals("blue")) return new Blue();
        else if (color.equals("green")) return new Green();
        
        return null;
    }
    
    @Override
    Shape getShape(String shape) {
        return null;
    }
    
}
