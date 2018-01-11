package Chapter2;

import java.util.Scanner;

/**
 * Program to display the area and volume of a cylinder when the radius and
 * length is entered to the console
 *
 * @author Cristian Ortiz
 */

public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area of the cylinder is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
