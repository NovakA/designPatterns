/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral;

import behavioral.Observer.MainObserver;
import behavioral.Strategy.MainStrategy;
import behavioral.Template.MainTemplate;
import behavioral.MVC.MainMVC;
import designpatterns.Patterns;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class Behavioral extends Patterns {

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
                case "o":
                    concretePatterns = new MainObserver();
                    break;
                case "s":
                    concretePatterns = new MainStrategy();
                    break;
                case "t":
                    concretePatterns = new MainTemplate();
                    break;
                case "m":
                    concretePatterns = new MainMVC();
                    break;
                case "h":
                    help();
                    break;
                default:
                    break;
                    
            }
            if (concretePatterns != null) {
                concretePatterns.setBehavioral(this);
                concretePatterns.chooseConcretePatterns(reader);
            }
        }
    }

    @Override
    public void help() {
        System.out.println("b - back to menu\n"
                + "o - observer\n"
                + "s - strategy\n"
                + "t - template\n"
                + "m - mvc\n"
                + "h - help");
    }
}
