/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.Observer;

import behavioral.ConcretePatterns;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class MainObserver extends ConcretePatterns {

    @Override
    public void help() {
        System.out.println("b - back to structural menu\n"
                + "h - for help\n"
                + "number - to see in binary,hexadecimal and octal format");
    }

    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        
        String string;
        while (true) {
            string = reader.next();
            switch (string) {
                case "b":
                    behavioral.choose();
                    break;
                case "h":
                    help();
                    break;
                default:
                    subject.setState(Integer.valueOf(string));
                    break;
            }
        }
    }

}
