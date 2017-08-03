/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

import behavioral.Behavioral;
import structural.Structural;
import java.util.Scanner;
import creational.Creational;

/**
 *
 * @author Adam
 */
public class ChoosePatterns {

    Scanner reader = new Scanner(System.in);
    Patterns patterns = null;

    public ChoosePatterns() {
        choose();
    }
    
    public void choose() {
        help();
        while (true) {
            System.out.println("Enter symbol: ");

            switch (reader.next()) {
                case "h":
                    help();
                    break;
                case "b":
                    patterns = new Behavioral();
                    break;
                case "s":
                    patterns = new Structural();
                    break;
                case "c":
                    patterns = new Creational();
                    break;
                case "q":
                    System.exit(0);
            }
            if (patterns != null) {
                patterns.setChoosePatterns(this);
                patterns.choose();
            }
        }
    }

    /**
     *
     */
    public static void help() {
        System.out.println("Welcome to menu:\n"
                + "Press: q - quit application\n"
                + "b - behavioral design patterns\n"
                + "s - structural design patterns\n"
                + "c - creational design patterns");
    }
}
