package io.codelex.arithmetic.practice;

public class number1 {

    public static void main(String[] args) {

        calc(69, 56);

    }

    public static void calc(int int1, int int2) {

        if (int1 == 15 || int2 == 15 || int1+int2 == 15 || int1-int2 == 15) {
            System.out.println(true);
        } else{
            System.out.println("U won the prize!!!");
        }
        System.out.println("Goodbye.");
    }

}
