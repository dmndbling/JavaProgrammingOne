package Chapter7;

import java.util.*;

/**
 * Program to tell you the smallest number out of a list.
 *
 * @author Cristian Ortiz
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double minimum = min(numbers);

        System.out.println("\nThe minimum number is: " + minimum);
    }

    /**
     * method to calculate which number is the smallest
     *
     * @param array contains the list of numbers
     * @return the smallest number
     */
    public static double min(double[] array) {
        Arrays.sort(array);
        double minimum = array[0];

        return minimum;

    }
}
