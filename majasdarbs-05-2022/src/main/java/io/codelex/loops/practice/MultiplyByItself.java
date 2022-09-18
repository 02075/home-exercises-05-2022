package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {

            int choice;

        do {

            System.out.print("RUN PROGRAM : 1 \n");
            System.out.print("Quit program : 2 \n");

            Scanner in = new Scanner(System.in);

            choice = in.nextInt();

            if (choice == 1) {
                Multiply();
            } else if (choice == 2) {
                System.out.println("Bye");
            } else{System.out.println("invalid input");}


        } while(choice !=2);

    }

    public static void Multiply(){

        System.out.print("Input VALUE : ");
        Scanner in = new Scanner(System.in);

        int initialValue = in.nextInt();

        System.out.print("Input number of terms : ");

        int n = in.nextInt();

        int value = initialValue;

        //todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()

        for (int i = 1; i < n; i++) {
            value *= initialValue;
        }

        System.out.println(value);

    }

}
