/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.Template;

/**
 *
 * @author Adam
 */
public class Cricket extends Game{

    @Override
    public void initialize() {
        System.out.println("Cricket game initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket game started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket game finished!");
    }
    
}
