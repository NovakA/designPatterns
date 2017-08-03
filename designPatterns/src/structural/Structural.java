/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

import structural.Composite.MainComposite;
import structural.Decorator.MainDecorator;
import structural.Facade.MainFacade;
import structural.Proxy.MainProxy;
import structural.Adapter.MainAdapter;
import designpatterns.Patterns;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class Structural extends Patterns {

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
                case "a":
                    concretePatterns = new MainAdapter();
                    break;
                case "c":
                    concretePatterns = new MainComposite();
                    break;
                case "d":
                    concretePatterns = new MainDecorator();
                    break;
                case "f":
                    concretePatterns = new MainFacade();
                    break;
                case "p": 
                    concretePatterns = new MainProxy();
                    break;
                case "h":
                    help();
                    break;
                default:
                    break;
                    
            }
            if (concretePatterns != null) {
                concretePatterns.setStructural(this);
                concretePatterns.chooseConcretePatterns(reader);
            }
        }
    }

    @Override
    public void help() {
        System.out.println(" b - back to menu\n"
                + "a - adapter\n"
                + "c - composite\n"
                + "d - decorator\n"
                + "f - facade\n"
                + "p - proxy\n"
                + "h - help");
    }
    
}
