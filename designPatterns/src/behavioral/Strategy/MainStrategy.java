/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.Strategy;

import behavioral.ConcretePatterns;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class MainStrategy extends ConcretePatterns {

    @Override
    public void help() {
        System.out.println("b - back to structural menu\n"
                + "h - for help\n"
                + "number +/-/* number");
    }

    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        Context context = null;
        String[] parts;
        String input;
        while (true) {
            input = reader.nextLine();
            switch (input) {
                case "b":
                    behavioral.choose();
                    break;
                case "h":
                    help();
                    break;
                default:
                    try {
                        parts = input.split(" ");
                        if (parts.length == 3) {
                            switch (parts[1]) {
                                case "+":
                                    context = new Context(new OperationAdd());
                                    break;
                                case "-":
                                    context = new Context(new OperationSubstract());
                                    break;
                                case "*":
                                    context = new Context(new OperationMultiply());
                                    break;
                            }
                        }
                        if (context != null) {
                            System.out.println(parts[0] + " " + parts[1] + " " + parts[2] + " = " + context.executeStrategy(Integer.valueOf(parts[0]), Integer.valueOf(parts[2])));
                        }
                    } catch (ClassCastException e) {
                        System.out.println("Input in form: number +/-/* number");
                    }
                    break;
            }
        }
    }

}
