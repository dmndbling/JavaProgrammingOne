package Chapter4;

import java.util.Scanner;

/**
 * Program to display substrings of two strings to the console
 *
 * @author Cristian Ortiz
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = input.next();
        System.out.println("Enter string s2");
        String s2 = input.next();
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a subrting of " + s1);
        } else {
            System.out.println("No substrings.");
        }
    }
}
