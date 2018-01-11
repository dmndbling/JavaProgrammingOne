package Chapter2;

import java.util.Scanner;

/**
 * Program to display the price of food, the tax, the tip, and total cost of a
 * meal, drink, and dessert to the console
 *
 * @author Cristian Ortiz
 */

public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //variables
        double Meal, Drink, Dessert, SalesTax, Tip, FoodTotal, Total;
        //prices
        System.out.print("Enter the price of a meal...");
        Meal = input.nextDouble();
        System.out.print("Enter the price of a drink...");
        Drink = input.nextDouble();
        System.out.print("Enter the price of a dessert...");
        Dessert = input.nextDouble();
        //formulas
        FoodTotal = Meal + Drink + Dessert;
        SalesTax = FoodTotal * 0.10;
        Tip = (SalesTax + FoodTotal) * 0.15;
        Total = FoodTotal + SalesTax + Tip;
        //totals
        System.out.println("The price of the food is $" + FoodTotal + ".The tax is $" + SalesTax + ".The tip is $" + Tip + " The total cost is $" + Total + ".");

    }

}
