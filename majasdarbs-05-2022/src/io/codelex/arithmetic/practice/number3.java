package io.codelex.arithmetic.practice;

import java.sql.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
public class number3 {

    public static void main(String[] args) {
        SumAverageRunningInt();
    }
    public static void SumAverageRunningInt() {

        int start = 1;
        int end = 100;

        int[] arr = IntStream.rangeClosed(start,end).toArray();

        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        float avg = (sum/arr.length);

        System.out.println("The sum of " +start+ " to " +end+ " is " +sum);
        System.out.println("The average is "+avg);

    }

}
