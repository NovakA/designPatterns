/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral;

import java.util.Scanner;

/**
 *
 * @author Adam
 */
public abstract class ConcretePatterns {

    public Behavioral behavioral;

    public abstract void help();

    public void setBehavioral(Behavioral behavioral) {
        this.behavioral = behavioral;
    }

    public abstract void chooseConcretePatterns(Scanner reader);

}
