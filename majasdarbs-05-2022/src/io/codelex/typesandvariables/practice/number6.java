package io.codelex.typesandvariables.practice;

public class number6 {

    public static void main(String[] args) {

        sumOfInts(9, 7, 4, 5, 3, 3, 9, 6);

    }

    public static void sumOfInts(int... args) {
        int sum = 0;
        for (int arg: args){
            sum += arg;
        }
        System.out.println(sum);
    }

}
