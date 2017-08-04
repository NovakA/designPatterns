/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.Template;

import behavioral.ConcretePatterns;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class MainTemplate extends ConcretePatterns {

    @Override
    public void help() {
        System.out.println("b - back to structural menu\n"
                + "h - for help\n"
                + "c - cricket game\n"
                + "f - football game");
    }

    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        Game game;

        while (true) {
            switch (reader.next()) {
                case "b":
                    behavioral.choose();
                    break;
                case "h":
                    help();
                    break;
                case "c":
                    game = new Cricket();
                    game.play();
                    break;
                case "f":
                    game = new Football();
                    game.play();
                    break;
                default:
                    break;
            }
        }
    }
    
}
