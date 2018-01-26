package Chapter8;

import java.util.*;

/**
 * Program to create a chart of employees
 *
 * @author Cristian Ortiz
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"A", "B", "C", "D"};
        String[] days = {"M", "T", "W", "H", "F"};
        double[][] sales = new double[4][5];
        String resp;
        do {
            System.out.println("Enter a letter for a name (A, B, C, or D): ");
            String namecod = input.next();
            System.out.println("Enter a letter a day (M, T, W, H, F): ");
            String daycod = input.next();
            sales = placeValue(names, days, namecod, daycod, sales);
            do {
                System.out.println("Do you want to continue (y or n): ");
                resp = input.next();
            } while (!resp.equalsIgnoreCase("y") && !resp.equalsIgnoreCase("n") && !resp.equalsIgnoreCase("N") && !resp.equalsIgnoreCase("Y"));
        } while (resp.equalsIgnoreCase("y"));
        System.out.println("    M   T    W   H   F");
        System.out.println("A [" + sales[0][0] + " " + sales[0][1] + " " + sales[0][2] + " " + sales[0][3] + " " + sales[0][4] + "]");
        System.out.println("B [" + sales[1][0] + " " + sales[1][1] + " " + sales[1][2] + " " + sales[1][3] + " " + sales[1][4] + "]");
        System.out.println("C [" + sales[2][0] + " " + sales[2][1] + " " + sales[2][2] + " " + sales[2][3] + " " + sales[2][4] + "]");
        System.out.println("D [" + sales[3][0] + " " + sales[3][1] + " " + sales[3][2] + " " + sales[3][3] + " " + sales[3][4] + "]");
    }

    /**
     * method to fill array
     *
     * @param names holds the names in a list
     * @param days holds the days in a list
     * @param nc holds the name code
     * @param dc holds the day code
     * @param rate holds the rates
     * @return the employees chart
     */
    public static double[][] placeValue(String[] names, String[] days, String nc, String dc, double[][] rate) {
        Scanner input = new Scanner(System.in);
        int row = java.util.Arrays.binarySearch(names, nc);
        int column = 0;
        for (int i = 0; i < days.length; ++i) {
            if (days[i].equals(dc)) {
                column = i;
            }
        }
        System.out.println("Enter a new sales: ");
        double price = input.nextDouble();
        rate[row][column] += price;
        return rate;
    }
}
