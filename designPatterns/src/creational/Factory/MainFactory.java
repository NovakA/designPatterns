/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Factory;

import creational.ConcretePatterns;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class MainFactory extends ConcretePatterns {

    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        ShapeFactory shapeFactory = new ShapeFactory();
        while (true) {
            switch (reader.next()) {
                case "b":
                    creational.choose();
                    break;
                case "h":
                    help();
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

            }
        }
    }

    @Override
    public void help() {
        System.out.println("b - back to creational menu\n"
                + "c/r/s - circle/rectangle/square object"
                + "h - help");
    }
}
