/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.Proxy;

import java.util.Scanner;
import structural.ConcretePatterns;

/**
 *
 * @author Adam
 */
public class MainProxy extends ConcretePatterns {
    
    @Override
    public void help() {
        System.out.println("b - back to structural menu\n"
                + "h - for help\n");
    }


    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        Image image = new ProxyImage("test_10mb.jpg");
        
        image.display();
        System.out.println("");
        image.display();
        while (true) {
            switch (reader.next()) {
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
