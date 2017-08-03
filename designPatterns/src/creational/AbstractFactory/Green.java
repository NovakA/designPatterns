/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.AbstractFactory;

import creational.AbstractFactory.Color;

/**
 *
 * @author Adam
 */
public class Green implements Color {

   @Override
    public void fill() {
        System.out.println("Inside Green::fill() method!");
    }
}
