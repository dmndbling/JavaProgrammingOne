package Chapter6;
import java.util.Scanner;
/**
 * Program to convert currency to dollars
 *
 * @author Cristian Ortiz
 */


public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many Euros will a dollar buy? ");
        double euro = input.nextDouble();
        System.out.println("How many Pound Sterling will a dollar buy? ");
        double sterling = input.nextDouble();
        System.out.println("How many yen will a dollar buy? ");
        double yen = input.nextDouble();

        String answer = "";
        do {
            System.out.println("Enter the number of dollars you want to convert: ");
            double dollars = input.nextDouble();
            System.out.println("Enter E, P, or Y. ");
            String code = input.next().toUpperCase();

            // Perform conversion based on code entered
            switch (code) {
                case "E":
                    double E = convert(dollars, euro);
                    System.out.printf("For %.2f dollars, you will get %.2f euros.", dollars, E);
                    break;
                case "P":
                    double P = convert(dollars, sterling);
                    System.out.printf("For %.2f dollars, you will get %.2f sterling.", dollars, P);
                    break;
                case "Y":
                    double Y = convert(dollars, yen);
                    System.out.printf("For %.2f dollars, you will get %.2f yen.", dollars, Y);
                    break;
            }

            // ask if there are any more conversions
            do {
                System.out.println(" Are there more converssions to perform? ");
                answer = input.next();
            } while (!answer.equalsIgnoreCase("yes") && (!answer.equalsIgnoreCase("no")));

        } while (answer.equalsIgnoreCase("yes"));

    }

    /**
     * method to convert currency to dollars
     *
     * @param dollars the amount of dollars that is being converted
     * @param currency the amount of currency that is being converted
     * @return the amount of dollars the currency is equivalent to
     */
    public static double convert(double dollars, double currency) {
        double total;
        if (dollars > 100) {
            total = dollars * 0.95 * currency;
        } else {
            total = dollars * 0.90 * currency;
        }
        return total;
    }
}
