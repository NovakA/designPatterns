/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral;

import designpatterns.ChoosePatterns;
import designpatterns.Patterns;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class Behavioral extends Patterns {

    Scanner reader = new Scanner(System.in);

    @Override
    public void help() {
        System.out.println("Press: o - observer");
    }

    @Override
    public void choose() {
        while (true) {
            System.out.println("Enter number: ");

            switch (reader.next()) {
                case "h":
                    help();
                    break;
                case "b":
            }
        }
    }
}
