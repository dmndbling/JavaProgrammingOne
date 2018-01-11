package Chapter2;

import java.util.Scanner;

/**
 * Program to convert Celsius to Fahrenheit and display it to the console
 *
 * @author Cristian Ortiz
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;

        System.out.print("Enter degrees in celsius:");
        double celsius = input.nextDouble();
        fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " in fahrenheit");

    }
}
