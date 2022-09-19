package io.codelex.arithmetic.practice;

public class CheckOddEven {

    public static void main(String[] args) {

        program(68);

    }

    public static void program(int input) {

        if (input % 2 == 0) {
            System.out.println("Entered Number is Even");
        }

        else {
            System.out.println("Entered Number is Odd");
        }

        System.out.println("bye");
    }

}
