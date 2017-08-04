/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.Decorator;

import java.util.Scanner;
import structural.ConcretePatterns;

/**
 *
 * @author Adam
 */
public class MainDecorator extends ConcretePatterns {

    @Override
    public void help() {
        System.out.println("b - back to structural menu\n"
                + "h - for help\n");
    }


    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        
        circle.draw();
        redCircle.draw();
        redRectangle.draw();
        
        String input;
        while (true) {
            input = reader.next();
            switch (input) {
                case "b":
                    structural.choose();
                    break;
                case "h":
                    help();
                    break;
                default: 
                    break;
            }
        }
    }

}
