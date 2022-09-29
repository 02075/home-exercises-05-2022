package io.codelex.arrays.practice;

import java.util.Arrays;

public class Number6 {

    public static void main (String[] args){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
        int[] newArray = new int[10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = -7;

        System.out.println(Arrays.toString(array) + "\n" + Arrays.toString(newArray));
    }
}
