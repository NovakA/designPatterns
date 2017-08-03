/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational;

import java.util.Scanner;

/**
 *
 * @author Adam
 */
public abstract class ConcretePatterns {

    public Creational creational;

    public abstract void help();

    public void setCreational(Creational creational) {
        this.creational = creational;
    }

    public abstract void chooseConcretePatterns(Scanner reader);
}
