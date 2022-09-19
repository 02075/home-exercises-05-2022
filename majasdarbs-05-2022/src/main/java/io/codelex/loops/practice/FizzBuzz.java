package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        System.out.println("Stet max value: ");
        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        theProgram(max);
    }

    public static void theProgram(int arg){
        for (int i = 1; i <= arg; i++) {

            if (i %3 == 0 && i %5 == 0) {
                System.out.println("Fizzbuzz ");
            } else if (i %3 == 0 ){
                System.out.println("Fizz ");
            } else if (i %5 == 0 ){
                System.out.println("Buzz ");
            } else {System.out.println(i + " ");}

        }
    }
}
