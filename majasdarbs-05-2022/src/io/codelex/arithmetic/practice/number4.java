package io.codelex.arithmetic.practice;

public class number4 {

    public static void main(String[] args){

        Product1ToN(5);

    }

    public static void Product1ToN(int n){

        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }


        System.out.println("Factorial of "+n+" is: "+fact);
    }

}
