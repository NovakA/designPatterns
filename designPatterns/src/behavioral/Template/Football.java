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
public class Football extends Game{

    @Override
    public void initialize() {
        System.out.println("Football game initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football game started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Football game finished!");
    }
    
}
