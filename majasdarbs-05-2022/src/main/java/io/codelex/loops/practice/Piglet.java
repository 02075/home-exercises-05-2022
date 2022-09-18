package io.codelex.loops.practice;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Welcome to piglet! Press y to roll or s to get sum/quit.");
        int sum = 0;
        String str;

        for (int i = 0; i < 1;) {

            str = n.nextLine();
            int randNum = piggy();

            if (randNum == 1) {
                System.out.println("Your rolled a 1 and your score is dead.");
                break;
            }

            if (Objects.equals(str, "y")) {
                System.out.println("You rolled a "+randNum);
                System.out.println("Roll again?");
                sum += randNum;
            } else if (Objects.equals(str, "s")) {
                System.out.println("Full count :"+sum);
                break;
            } else {System.out.println("Invalid input!");}
        }
    }

    public static int piggy(){
        Random random = new Random();
        return random.nextInt(6 - 1 + 1) + 1;
    }
}
