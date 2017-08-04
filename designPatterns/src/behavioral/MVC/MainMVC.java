/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.MVC;

import behavioral.ConcretePatterns;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class MainMVC extends ConcretePatterns {

    @Override
    public void help() {
        System.out.println("b - back to structural menu\n"
                + "h - for help\n"
                + "n - set name\n"
                + "r - set roll No\n"
                + "p - print");
    }

    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        Student model = getFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,view);
        
        String[] parts;
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
                case "p":
                    controller.updateView();
                    break;
                case "n":
                    System.out.print("Set name: ");
                    controller.setStudentName(reader.next());
                    break;
                case "r":
                    System.out.println("Set rool No: ");
                    controller.setStudentRollNo(reader.next());
                    break;
                default:
                    break;
            }
        }
    }

    private Student getFromDatabase() {
        Student student = new Student();
        student.setName("meno");
        student.setRollNo("5");
        return student;
    }
    
}
