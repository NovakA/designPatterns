/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Factory;

/**
 *
 * @author Adam
 */
public class ShapeFactory {

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
}
