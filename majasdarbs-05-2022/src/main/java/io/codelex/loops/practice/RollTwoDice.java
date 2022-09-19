package io.codelex.loops.practice;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;



public class RollTwoDice {
    public static void main(String[] args){
        System.out.println("Enter desired sum of two dice: ");
        Scanner n = new Scanner(System.in);
        int input = n.nextInt();
        n.nextLine();
        int rolls = 0;

        do {
            int die1 = diceRoll();
            int die2 = diceRoll();
            int sum = die1 + die2;
            rolls += 1;
            System.out.println(die1 + " and " + die2 + " = " + sum);

            if (input == sum) {

                if (rolls == 1) {
                    System.out.println("You rolled the sum on the first try. +1 luck.");
                } else {
                    System.out.println("It took " + rolls + " dice rolls to get the sum.");
                }

                rolls = 0;
                sum = 0;
                String input1;

                do {
                    System.out.println("Roll again? y/n");
                    input1 = n.nextLine();

                    if (Objects.equals(input1, "y")) {
                        System.out.println("Enter desired sum of two dice: ");

                        do {
                            input = n.nextInt();
                            n.nextLine();
                            if (input > 12 || input < 2) {
                                System.out.println("Invalid input.");
                                System.out.println("Enter desired sum of two dice: ");
                            }
                        } while (input > 12 || input < 2);

                    } else if (Objects.equals(input1, "n")) {
                        System.out.println("Bye!");
                        break;
                    } else {System.out.println("Invalid input!");}

                } while (!input1.equals("y") && !input1.equals("n"));
            }
        } while (true);
    }

    public static int diceRoll(){
        Random random = new Random();
        return random.nextInt(6 - 1 + 1) + 1;
    }
}
