package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

    //TODO: Write a Java program to sum values of an array.
    // Array values are starting from min (including) till max (including) number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();

        int sum = 0;
        int arrLength = maxNumber - minNumber + 1;
        int[] myArray = new int[arrLength];

        //fixme

        for (int i = 0; i <= myArray.length - 1; i++) {
            myArray[i] = minNumber;
            sum += myArray[i];
            minNumber++;
        }

        System.out.println("The sum is " + sum);
        System.out.println(Arrays.toString(myArray));
    }
}
