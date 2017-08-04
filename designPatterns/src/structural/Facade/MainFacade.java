/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.Facade;

import java.util.Scanner;
import structural.ConcretePatterns;

/**
 *
 * @author Adam
 */
public class MainFacade extends ConcretePatterns {

    @Override
    public void help() {
        System.out.println("b - back to structural menu\n"
                + "h - for help\n"
                + "c - circle\n"
                + "s - square\n"
                + "r - rectangle\n");
    }

    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        ShapeMaker shapeMaker = new ShapeMaker();
        while (true) {
            switch (reader.next()) {
                case "b":
                    structural.choose();
                    break;
                case "h":
                    help();
                    break;
                case "c":
                    shapeMaker.drawCircle();
                    break;
                case "r":
                    shapeMaker.drawRectangle();
                    break;
                case "s":
                    shapeMaker.drawSquare();
                    break;
                default:
                    break;
            }
        }
    }
}
