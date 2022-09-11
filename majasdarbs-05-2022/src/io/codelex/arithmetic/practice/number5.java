package io.codelex.arithmetic.practice;
import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;
public class number5 {

    public static void main(String[] args){

        russianRoulette();

    }

    public static void russianRoulette(){

        System.out.println("I'm thinking of a number between 1-100.  If u fail u DIE.");

        Random rand = new Random(); //instance of random class
        int int_random = rand.nextInt(101);

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if (input.matches("[a-zA-Z_]+")) {
            System.out.println("invalid input");
        }

        if (Integer.parseInt(input) == int_random) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (Integer.parseInt(input) > int_random){
            System.out.println("Sorry, you are too high.  I was thinking of " + int_random +".");
        } else if (Integer.parseInt(input) < int_random){
            System.out.println("Sorry, you are too low.  I was thinking of " + int_random +".");
        }

    }

}
