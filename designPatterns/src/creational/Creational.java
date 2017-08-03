/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational;

import creational.Builder.MainBuilder;
import creational.Singleton.MainSingleton;
import creational.AbstractFactory.MainAbstractFactory;
import creational.Factory.MainFactory;
import designpatterns.Patterns;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class Creational extends Patterns {

    Scanner reader = new Scanner(System.in);
    ConcretePatterns concretePatterns =  null;

    @Override
    public void choose() {
        help();
        while (true) {
            switch (reader.next()) {
                case "b":
                    choosePatterns.choose();
                    break;
                case "f":
                    concretePatterns = new MainFactory();
                    break;
                case "a":
                    concretePatterns = new MainAbstractFactory();
                    break;
                case "s":
                    concretePatterns = new MainSingleton();
                    break;
                case "r":
                    concretePatterns = new MainBuilder();
                    break;
                case "h":
                    help();
                    break;
                default:
                    break;
            }
            if (concretePatterns != null) {
                concretePatterns.setCreational(this);
                concretePatterns.chooseConcretePatterns(reader);
            }
        }
    }
    
    @Override
    public void help() {
        System.out.println("Welcome to creational menu:\n"
                + "b - back to menu\n"
                + "f - factory\n"
                + "a - abstract factory\n"
                + "s - singleton\n"
                + "r - builder\n"
                + "h - help");
    }
}
