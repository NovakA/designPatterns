/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.Decorator;

/**
 *
 * @author Adam
 */
public class RedShapeDecorator extends ShapeDecorator {

    public Shape shape;
    
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
 
    public void setRedBorder(Shape decoratecShape) {
        System.out.println("Border Color: Red");
    }
}
