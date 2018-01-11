package Chapter2;

import java.util.Scanner;

/**
 * Program to display gratuity and total when subtotal and tip rate are entered
 * to the console
 *
 * @author Cristian Ortiz
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double subTotal, tip, total, tipPercentage;
        System.out.print("enter a subtotal:");
        subTotal = input.nextDouble();
        System.out.print("Enter the tip rate:");
        tipPercentage = input.nextDouble();
        tip = (tipPercentage / 100.0) * subTotal;
        total = tip + subTotal;
        System.out.println("The gratuity is " + tip + " and total is " + total);

    }
}
