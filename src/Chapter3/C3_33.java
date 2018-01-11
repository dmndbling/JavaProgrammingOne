package Chapter3;

import java.util.Scanner;

/**
 * Program to display which sale has the better deal to the console
 *
 * @author Cristian Ortiz
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight1, weight2, price1, price2;
        System.out.println("Enter a price for the first item ");
        price1 = input.nextDouble();
        System.out.println("Enter the weight for the first item ");
        weight1 = input.nextDouble();
        System.out.println("Enter a price for the second item ");
        price2 = input.nextDouble();
        System.out.println("Enter the weight for the secon item ");
        weight2 = input.nextDouble();
        if (price1 / price2 < price2 / weight2) {
            System.out.println("Package 1 has a better deal.");
        } else if (price1 / weight1 > price2 / weight2) {
            System.out.println("Package 2 has a better deal.");
        } else {
            System.out.println("Same price.");
        }

    }
}
