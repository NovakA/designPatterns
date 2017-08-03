/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

/**
 *
 * @author Adam
 */
public abstract class Patterns {

    protected ChoosePatterns choosePatterns;

    public abstract void help();

    public void setChoosePatterns(ChoosePatterns choosePatterns) {
        this.choosePatterns = choosePatterns;
    }

    public ChoosePatterns getChoosePatterns() {
        return choosePatterns;
    }

    public abstract void choose();
}
