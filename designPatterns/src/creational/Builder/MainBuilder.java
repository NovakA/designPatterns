/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Builder;

import creational.ConcretePatterns;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class MainBuilder extends ConcretePatterns {

    List <Meal> meals = new ArrayList<Meal>();
    
    @Override
    public void help() {
        System.out.println("b - back to creational menu\n"
                + "v - vegan meal\n"
                + "n - non vegan meal\n"
                + "c - count our order\n"
                + "r - reset order\n"
                + "h - help");
    }

    @Override
    public void chooseConcretePatterns(Scanner reader) {
        help();
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal vegMeal;
        Meal nonVegMeal;
        
        while (true) {
            switch (reader.next()) {
                case "b": 
                    creational.choose();
                    break;
                case "v":
                    vegMeal = mealBuilder.prepareVegaMeal();
                    meals.add(vegMeal);
                    break;
                case "n":
                    nonVegMeal = mealBuilder.prepareNonVegalMeal();
                    meals.add(nonVegMeal);
                    break;
                case "c":
                    count();
                    break;
                case "r":
                    meals.clear();
                    break;
                case "h":
                    help();
                    break;
            }
            
        }
    }
    
    public void count() {
        float cost = 0.0f;
        for (Meal meal: meals) {
            meal.showItems();
            meal.getCost();
            cost += meal.getCost();
        }
        System.out.println("Total cost: " + cost);
    }
}
