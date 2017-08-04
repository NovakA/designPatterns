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
public abstract class Game {

    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
