package Chapter4;

import java.util.Scanner;

/**
 * Program to display class and grade through a code to the console
 *
 * @author Cristian Ortiz
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters. ");
        String a = input.next().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);
        if (c != '1' && c != '2' && c != '3' && c != '4') {
            System.out.println("Invalid input.");
            System.exit(0);
        }
        switch (b) {
            case 'M':
                System.out.println("Maths");
                break;
            case 'C':
                System.out.println("Computer Science");
                break;
            case 'I':
                System.out.println("Information Technology");
                break;
            default:
                System.out.println("Invalid input.");
                System.exit(0);
                break;

        }
        switch (c) {
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophmore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
                break;
        }
    }
}
