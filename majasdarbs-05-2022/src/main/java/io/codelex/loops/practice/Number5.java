package io.codelex.loops.practice;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String input2 = in.nextLine();
        System.out.println(pointMachine(input, input2));
        System.out.println("The length of this string is:" + pointMachine(input, input2).length());
    }

    public static String pointMachine(String str1, String str2) {
        int dots = 30 - (str1.length() + str2.length());
        String str = str1;

        if (dots >= 0) {

            for (int i = 0; i < dots; i++) {
                str += '.';
            }
            str += str2;
            return str;

        } else {return new String("2much4me");}
    }
}
