/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.AbstractFactory;

/**
 *
 * @author Adam
 */
public class FactoryProducer {
    public static AbstractFactory getFactory (String choice) {
        if (choice.equals("shape"))
            return new ShapeAbstractFactory();
        else if (choice.equals("color"))
            return new ColorAbstractFactory();
        
        return null;
    }
}
