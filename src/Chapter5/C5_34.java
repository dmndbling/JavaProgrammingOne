package Chapter5;

import java.util.Scanner;

/**
 * Program to play rock paper scissors
 *
 * @author Cristian Ortiz
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerw = 0;
        int playerw = 0;

        while (playerw != 2 && computerw != 2) {
            int computer = (int) (Math.random() * 3);
            System.out.println("Rock = 0, Paper = 1, scissors = 2: ");
            int player = input.nextInt();

            if (player == 0 && computer == 1) {
                System.out.println("Computer is paper. You lose.");
                computerw += 1;
            } else if (player == 0 && computer == 2) {
                System.out.println("Computer is scissors. You win.");
                playerw += 1;
            } else if (player == 1 && computer == 0) {
                System.out.println("Computer is rock. You win.");
                playerw += 1;
            } else if (player == 1 && computer == 2) {
                System.out.println("computer is scissors. you lose.");
                computerw += 1;
            } else if (player == 2 && computer == 0) {
                System.out.println("computer is rock. you lose");
                computer += 1;
            } else if (player == 2 && computer == 1) {
                System.out.println("computer is paper. you win");
                playerw += 1;
            } else if (player == computer) {
                System.out.println("you both tied");
            }
        }
        if (playerw == 2) {
            System.out.println("you beat the computer.");
        }
        if (computerw == 2) {
            System.out.println("the computer beat you.");
        }
    }

}
