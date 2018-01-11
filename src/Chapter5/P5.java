package Chapter5;

import java.util.Scanner;

/**
 * Program to count votes
 *
 * @author Cristian Ortiz
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yes = 0;
        int no = 0;
        int notValid = 0;

        System.out.println("Enter Y for yes and N for no to quit enter Q");
        String vote = input.next();

        while (!vote.equalsIgnoreCase("Q")) {
            if (vote.equalsIgnoreCase("Y")) {
                yes++;
            } else if (vote.equalsIgnoreCase("N")) {
                no++;
            } else if (vote != "Y" || vote != "N" || vote != "Q") {
                System.out.println("\nInput invalid");
                System.out.println("Enter another letter.");
                vote = input.nextLine();
            }

            System.out.println("Enter Y for yes and N for no to quit enter Q");
            vote = input.next();

        }
        System.out.println("yes votes: " + yes);
        System.out.println("no votes: " + no);
    }
}
