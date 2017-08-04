/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.Composite;

import java.util.Scanner;
import structural.ConcretePatterns;

/**
 *
 * @author Adam
 */
public class MainComposite extends ConcretePatterns {

    Employee ceo;
    Employee headSales;
    Employee headMarketing;
    Employee clerk;
    Employee salesExecutive;

    @Override
    public void help() {
        System.out.println("b - back to structural menu\n"
                + "h - for help\n"
                + "p - for print employees\n"
                + "Input in form: name ceo/sales/marketing/headS/headM salary");
    }

    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();

        String[] parts;
        String input;
        while (true) {
            input = reader.nextLine();
            switch (input) {
                case "b":
                    structural.choose();
                    break;
                case "h":
                    help();
                    break;
                case "p":
                    print();
                    break;
                default:
                    try {
                        parts = input.split(" ");
                        if (parts.length == 3) {
                            switch (parts[1]) {
                                case "ceo":
                                    ceo = new Employee(parts[0], parts[1], Integer.valueOf(parts[2]));
                                    break;
                                case "sales":
                                    salesExecutive = new Employee(parts[0], parts[1], Integer.valueOf(parts[2]));
                                    headSales.add(salesExecutive);
                                    break;
                                case "marketing":
                                    clerk = new Employee(parts[0], parts[1], Integer.valueOf(parts[2]));
                                    headMarketing.add(clerk);
                                    break;
                                case "headS":
                                    headSales = new Employee(parts[0], parts[1], Integer.valueOf(parts[2]));
                                    ceo.add(headSales);
                                    break;
                                case "headM":
                                    headMarketing = new Employee(parts[0], parts[1], Integer.valueOf(parts[2]));
                                    ceo.add(headMarketing);
                                    break;
                            }
                        }
                    } catch (ClassCastException c) {
                        System.out.println("Input in form: name ceo/sales/marketing/headS/headM salary");
                    }
                    break;
            }
        }
    }

    private void print() {
        if (ceo != null) {
            System.out.println(ceo);
            for (Employee employee : ceo.getSubordinates()) {
                System.out.println(employee);
                for (Employee e : employee.getSubordinates()) {
                    System.out.println(e);
                }
            }
        }
    }

}
