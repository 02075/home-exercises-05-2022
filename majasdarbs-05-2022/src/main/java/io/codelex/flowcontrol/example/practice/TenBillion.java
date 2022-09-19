package io.codelex.flowcontrol.example.practice;

import java.util.Scanner;

public class TenBillion {
    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");
        long n = in.nextLong();
        //todo - check if Long
        if (n == (long)n) {
            //todo - check if n is less than zero
            if (n < 0) {
                n *= -1;
            }
            //fixme
            if (n >= Math.pow(10, 9)) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int digits = 1;
                String strInput = String.valueOf(n).replaceAll("[^0-9]", "");
                System.out.println("Number of digits in the number: " + strInput.length());
            }
        } else {
            System.out.println("The number is not a long");
        }
    }
}
