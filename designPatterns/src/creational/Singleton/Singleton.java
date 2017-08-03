/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Singleton;

/**
 *
 * @author Adam
 */
public class Singleton {

    private static Singleton singletonInstance = null;
    
    private Singleton(){};

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            synchronized(Singleton.class) {
                if (singletonInstance == null) {
                    singletonInstance = new Singleton();
                    showMessage();
                }
            }
        } else instanceExist();
        return singletonInstance;
    }
    
    private static void showMessage () {
        System.out.println("New Singleton Instance");
    }
    
    private static void instanceExist() {
        System.out.println("I am returning already exist Singleton!");
    }
}
