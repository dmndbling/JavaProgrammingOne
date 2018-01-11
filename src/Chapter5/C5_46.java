package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse whatever you type.
 *
 * @author Cristian Ortiz
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String words = new StringBuffer(word).reverse().toString();

        System.out.println("The string reversed is " + word);

    }
}
