package Chapter4;

import java.util.Scanner;

/**
 * Program to display the winner between two bidders to the console
 *
 * @author Cristian Ortiz
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //first bidder:
        System.out.println("Enter the name of the first bidder: ");
        String bidder1 = input.next();
        System.out.println("How many hours of work will the first bidder require: ");
        int bidderHours = input.nextInt();
        System.out.println("How much does the first bidder charge an hour: ");
        double bidderCharge = input.nextDouble();
        //second bidder
        System.out.println("Enter the name of the second bidder: ");
        String bidder2 = input.next();
        System.out.println("How many hours of work will the second bidder require: ");
        int bidder2Hours = input.nextInt();
        System.out.println("How much does the second bidder charge per hour: ");
        double bidder2Charge = input.nextDouble();
        //math
        double firstCost = bidderHours * bidderCharge;
        double secondCost = bidder2Hours * bidder2Charge;
        //if statements
        if (firstCost < secondCost) {
            System.out.printf("\nThe winner is %s with a total cost of %.2f", bidder1, firstCost);
        } else if (firstCost > secondCost) {
            System.out.printf("\nThe winner is %s with a total cost of %.2f", bidder2, secondCost);
        } else if (firstCost == secondCost && bidderHours < bidder2Hours) {
            System.out.printf("\nThe winner is %s with a total cost of %.2f with hours %d", bidder1, firstCost, bidderHours);
        } else if (firstCost == secondCost && bidderHours > bidder2Hours) {
            System.out.printf("\n The winner is %s with a total cost of %d and a total of %4.2f", bidder2, bidder2Hours, secondCost);
        } else if (firstCost == secondCost && bidderHours == bidder2Hours) {
            System.out.printf("\nBoth bidders have identical bids with %d hours, %4.2f \n cost for hours, %4.2f  cost", bidderHours, bidderCharge, bidderCharge, firstCost);
        }

    }
}
