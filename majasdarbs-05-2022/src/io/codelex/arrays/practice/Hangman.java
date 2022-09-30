package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    private static String[] words = {"terminator", "banana", "computer", "cow", "rain", "water" };
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;
    private static char[] misses = new char[7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (count < 7 && asterisk.contains("*")) {
            System.out.println("Misses: " + Arrays.toString(misses));
            System.out.println("Guess any letter in the word. You have " + (7-count) + " guesses.");
            System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }

        if (asterisk.equals(newasterisk)) {
            misses[count] = guess.charAt(0);
            count++;
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        } else if (count == 7) {
            System.out.println("You failed. The word was " + word);
        }
    }

}
