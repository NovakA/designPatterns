/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

import java.util.Scanner;

/**
 *
 * @author Adam
 */
public abstract class ConcretePatterns {
    public Structural structural;
    
    public abstract void help();
    public void setStructural(Structural structural) {
        this.structural = structural;
    }
    public abstract void chooseConcretePatterns(Scanner reader);
}
