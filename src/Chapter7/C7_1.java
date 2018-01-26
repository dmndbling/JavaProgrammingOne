package Chapter7;

import java.util.*;

/**
 * Program to calculate grades.
 *
 * @author Cristian Ortiz
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        double grades[] = new double[n];
        System.out.println("Enter how many grades you want");
        n = input.nextInt();
        int best = 100;
        gradeCalculation(grades);
    }

    /**
     * method to calculate grades
     *
     * @param grades has all the grades
     * @return calculated grades
     */
    public static double gradeCalculation(double grades[]) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int best = 100;
        System.out.println("Enter your grades");
        for (int i = 0; i < grades.length; i++) {
            n = input.nextInt();
            if (n >= best - 10) {
                System.out.println("Student has a score of " + n + " and is an A");
            } else if (n >= best - 20) {
                System.out.println("Student has a score of " + n + " and is a B");
            } else if (n >= best - 30) {
                System.out.println("Student has a score of " + n + " and is a C");
            } else if (n >= best - 40) {
                System.out.println("Student has a score of " + n + "and is a D");
            } else if (n >= best - 50) {
                System.out.println("Student has a score of " + n + "and is an F");
            }
        }
        return best;
    }
}
