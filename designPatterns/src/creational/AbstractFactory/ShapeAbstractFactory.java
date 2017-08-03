/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.AbstractFactory;

import creational.Factory.Shape;
import creational.Factory.Square;
import creational.Factory.Circle;
import creational.Factory.Rectangle;

/**
 *
 * @author Adam
 */
public class ShapeAbstractFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("circle")){
         return new Circle();
         
      } else if(shapeType.equalsIgnoreCase("rectangle")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("square")){
         return new Square();
      }
      
      return null;
   }

    @Override
    Color getColor(String color) {
        return null;
    }
    
}
