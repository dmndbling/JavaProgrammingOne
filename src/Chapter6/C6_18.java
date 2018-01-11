package Chapter6;

import java.util.Scanner;

/**
 * Program to create a password
 *
 * @author Cristian Ortiz
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String passcode;
        int number = 0;
        System.out.println("Enter a password. ");
        passcode = input.next();
        for (int i = 0; i < passcode.length(); i++) {
            if (Character.isDigit(passcode.charAt(i))) {
                ++number;
            } else if (!Character.isLetterOrDigit(passcode.charAt(i))) {
                System.out.println("Password must contain letters and digits only. ");
                System.out.println("Invalid. ");
                System.exit(0);
            }

        }
        if ((passcode.length() < 8) || (number < 2)) {
            if (passcode.length() < 8) {
                System.out.println("Passwords must be eight characters at least. ");
                System.out.println("Invalid Password. ");
            }
            if (number < 2) {
                System.out.println("Password must contain 2 digits. ");
                System.out.println("Invalid Password. ");
            }
        } else {
            System.out.println("Valid. ");
        }
    }

}
