package io.codelex.flowcontrol.example.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
      prog();
    }
    public static void prog() {
        System.out.println("Number from one to seven.");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        Integer[] days = {1,2,3,4,5,6,7};
        List<Integer> dayList = new ArrayList<>(Arrays.asList(days));
        String day = new String();
        if (dayList.contains(input)) {
            switch (input){
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
            }
        } else {System.out.println("Invalid input");}
        System.out.println(day);
    }
}
