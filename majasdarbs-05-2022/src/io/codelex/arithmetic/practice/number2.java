package io.codelex.arithmetic.practice;

public class number2 {

    public static void main(String[] args) {

        checkOddEven(68);

    }

    public static void checkOddEven(int input) {

        if (input % 2 == 0) {
            System.out.println("Entered Number is Even");
        }

        else {
            System.out.println("Entered Number is Odd");
        }

        System.out.println("bye");
    }

}
