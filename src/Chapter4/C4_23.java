package Chapter4;

import java.util.Scanner;

/**
 * Program to display an employee's name, hours worked, pay rate, gross pay,
 * deductions, and net pay to the console
 *
 * @author Cristian Ortiz
 */

public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Name;
        double HoursWorked, PayRate, fTax, sTax, Total, pay;

        System.out.println("Enter employee's name: ");
        Name = input.next();
        System.out.println("Enter number of hours worked in a week: ");
        HoursWorked = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        PayRate = input.nextDouble();
        System.out.println("Enter federal tax witholding rate: ");
        fTax = input.nextDouble();
        System.out.println("Enter state tax witholding rate: ");
        sTax = input.nextDouble();

        pay = HoursWorked * PayRate;
        double FW = fTax * pay;
        double SW = sTax * pay;
        double loss = FW + SW;
        Total = pay - loss;

        System.out.println("Employee Name: " + Name);
        System.out.println("Hours worked: $" + HoursWorked);
        System.out.println("Pay rate: $" + PayRate);
        System.out.println("Gross pay: $" + pay);
        System.out.println("Deductions:");
        System.out.println("    Federal Withholding " + fTax + ": $" + FW);
        System.out.println("    State Witholding " + sTax + ": $" + SW);
        System.out.println("    Total deduction: $" + loss);
        System.out.println("Net Pay: $" + Total);

    }
}
