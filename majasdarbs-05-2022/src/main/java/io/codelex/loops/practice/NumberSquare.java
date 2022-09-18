package io.codelex.loops.practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NumberSquare {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input two integers");
        int input1 = in.nextInt(), input2 = in.nextInt();
        square(input1, input2);
    }

    public static void square(int min, int max) {
        int[] arr = IntStream.range(min, max + 1).toArray();
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length -1; j++) {
                arr[j] = arr[j +1];
            } arr[arr.length -1] = temp; System.out.println(Arrays.toString(arr));
        }
    }
}
