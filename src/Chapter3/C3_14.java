package Chapter3;

import java.util.Scanner;

/**
 * Program to play heads or tails
 *
 * @author Cristian Ortiz
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 2);
        int number2 = (int) (Math.random() * 2);
        System.out.println("Enter a number 1 or 0 where 1 is heads and 0 is tails:");
        double guess = input.nextDouble();
        //System.out.println(number1 +" and "+ number2);
        if (guess > number1) {
            System.out.println("Heads wins");
        } else if (guess < number1) {
            System.out.println("Tails wins");
        } else if (guess == number1) {
            System.out.println("Tie");
        }

    }
}
