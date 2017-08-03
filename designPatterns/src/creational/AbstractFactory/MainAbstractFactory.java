/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.AbstractFactory;

import creational.ConcretePatterns;
import creational.Factory.Shape;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class MainAbstractFactory extends ConcretePatterns {

    AbstractFactory shapeFactory;
    AbstractFactory colorFactory;

    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        shapeFactory = FactoryProducer.getFactory("shape");
        colorFactory = FactoryProducer.getFactory("color");
        while (true) {
            switch (reader.next()) {
                case "b":
                    creational.choose();
                    break;
                case "c":
                    Shape shapeCircle = shapeFactory.getShape("circle");
                    shapeCircle.draw();
                    break;
                case "r":
                    Shape shapeRectangle = shapeFactory.getShape("rectangle");
                    shapeRectangle.draw();
                    break;
                case "s":
                    Shape shapeSquare = shapeFactory.getShape("square");
                    shapeSquare.draw();
                    break;
                case "red":
                    Color redColor = colorFactory.getColor("red");
                    redColor.fill();
                    break;
                case "green":
                    Color greenColor = colorFactory.getColor("green");
                    greenColor.fill();
                    break;
                case "blue":
                    Color blueColor = colorFactory.getColor("blue");
                    break;
            }
        }
    }
    
    @Override
    public void help() {
        System.out.println("b - back to creatonal menu\n"
                + "c/r/s/ - circle/rectangle/square object\n"
                + "red/green/blue - red/green/blue object\n"
                + "h - help");
    }
}
