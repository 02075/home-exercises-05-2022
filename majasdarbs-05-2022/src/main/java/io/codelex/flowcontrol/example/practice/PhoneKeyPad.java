package io.codelex.flowcontrol.example.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (!input.contains("[^A-Za-z]")) {

            switch (input.charAt(i)){
                case 'c': System.out.println(2); case 'b': System.out.println(2); case 'a':
                    System.out.println(2);break;
                case 'f': System.out.println(3); case 'e': System.out.println(3); case 'd':
                    System.out.println(3);break;
                case 'i': System.out.println(4); case 'h': System.out.println(4); case 'g':
                    System.out.println(4);break;
                case 'l': System.out.println(5); case 'k': System.out.println(5); case 'j':
                    System.out.println(5);break;
                case 'o': System.out.println(6); case 'n': System.out.println(6); case 'm':
                    System.out.println(6);break;
                case 'r': System.out.println(7); case 'q': System.out.println(7); case 'p':
                    System.out.println(7);break;
                case 'u': System.out.println(8); case 't': System.out.println(8); case 's':
                    System.out.println(8);break;
                case 'x': System.out.println(9); case 'w': System.out.println(9); case 'v':
                    System.out.println(9);break;
                case 'z': System.out.println(0); case 'y':
                    System.out.println(0);break;
            }
            } else {System.out.println("Invalid inputs"); break;}
        }
    }
}


