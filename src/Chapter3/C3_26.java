package Chapter3;

import java.util.Scanner;

/**
 * Program to display "Welcome to Java" to the console
 *
 * @author Cristian Ortiz
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        double integer = input.nextDouble();
        System.out.println("Is " + integer + "divisible by 5 and 6 " + (integer % 5 == 0 && integer % 6 == 0));
        System.out.println("Is " + integer + "divisible by 5 or 6 " + (integer % 5 == 0 || integer % 6 == 0));
        System.out.println("Is " + integer + "divisible by 5 or 6, but not both " + (integer % 5 == 0 ^ integer % 6 == 0));
    }
}
