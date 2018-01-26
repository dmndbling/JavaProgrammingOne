package Chapter7;

import java.util.*;

/**
 * Program to create a list of numbers and average them.
 *
 * @author Cristian Ortiz
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of numbers that will be read: ");

        int amount = input.nextInt();
        int elements[] = new int[amount];

        fillArray(elements, input);
        System.out.print("Average: " + average(elements, amount));
        displayArray(elements);
    }

    /**
     * method to fill array
     *
     * @param elements the numbers that are in the array
     * @param Scanner input takes input from user
     * @return a filled array
     */
    public static void fillArray(int[] elements, Scanner input) {
        System.out.print("Enter " + elements.length + " elements: ");
        for (int counter = 0; counter < elements.length; counter++) {
            elements[counter] = input.nextInt();
        }
    }

    /**
     *method to average arrays
     *
     * @param elements the numbers that are in the array
     * @param amount amount of elements being used
     * @return a filled array
     */
    public static double average(int[] elements, int amount) {
        System.out.print("Enter " + elements.length + " elements: ");
        int total = 0;
        for (int counter = 0; counter < elements.length; counter++) {
            total += elements[counter];
        }
        double average = total / amount;
        return average;
    }

    /**
     * method to display arrays
     *
     * @param elements number of elements being used
     * @param Scanner input takes input from user
     * @return display array
     */
    public static void displayArray(int[] elements) {
        System.out.print("\nThis is the contents of the array " + Arrays.toString(elements));
    }
}
//fill in the missing code
