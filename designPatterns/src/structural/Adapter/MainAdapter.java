/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.Adapter;

import java.util.Scanner;
import structural.ConcretePatterns;

/**
 *
 * @author Adam
 */
public class MainAdapter extends ConcretePatterns {

    AudioPlayer audioPlayer;
    
    @Override
    public void help() {
        System.out.println("b - back to structural menu\n"
                + "h - for help\n"
                + "name.audiotype - add new input");
    }

    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        audioPlayer = new AudioPlayer();
        String[] parts;
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
                    try {
                        parts = input.split("\\.");
                        audioPlayer.play(parts[1], input);
                    } catch (ClassCastException c) {
                        System.out.println("Input must be in form name.type ");
                    }
                    break;
            }
        }
    }
}
