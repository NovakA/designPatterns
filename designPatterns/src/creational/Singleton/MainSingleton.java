/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Singleton;

import creational.ConcretePatterns;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class MainSingleton extends ConcretePatterns {

    Singleton singleton;
    
    @Override
    public void help() {
        System.out.println("b - back to creational menu\n"
                + "s - get Singleton instance");
    }

    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        while (true) {
            switch(reader.next()) {
                case "s":
                    singleton = Singleton.getInstance();
                    break;
                case "b":
                    creational.choose();
                    break;
            }
        }
    }
    
}
