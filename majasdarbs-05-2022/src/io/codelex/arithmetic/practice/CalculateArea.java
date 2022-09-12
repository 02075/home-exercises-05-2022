package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.math.BigDecimal.ZERO;

public class CalculateArea {
    public static void main(String[] args) {
        int choice; // The user's menu choice

        do {
            // Get the user's menu choice.
            choice = getMenu();

            if (choice == 1) {
                calculateCircleArea();
            } else if (choice == 2) {
                calculateRectangleArea();
            } else if (choice == 3) {
                calculateTriangleArea();
            } else if (choice == 4) {
                System.out.println("Thanks for calculating!");
            }

        } while (choice != 4);
    }

    public static int getMenu() {

        int userChoice;

        // keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Display the menu.
        System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit\n");
        System.out.print("Enter your choice (1-4) : ");

        // get input from user
        userChoice = keyboard.nextInt();

        // validate input
        while (userChoice < 1 || userChoice > 4) {
            System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
            userChoice = keyboard.nextInt();
        }

        return userChoice;
    }

    public static void calculateCircleArea() {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the circle's radius? ");


        BigDecimal radius = keyboard.nextBigDecimal();

        BigDecimal Area = BigDecimal.valueOf(Math.PI).multiply(radius.multiply(radius));

        // Display output
        System.out.println("The circle's area is "
                + Area);
    }

    public static void calculateRectangleArea() {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get length
        System.out.print("Enter length? ");

        BigDecimal length = (keyboard.nextBigDecimal());

        // Get width
        System.out.print("Enter width? ");

        BigDecimal width = (keyboard.nextBigDecimal());

        BigDecimal area = width.multiply(length);

        // Display output
        System.out.println("The rectangle's area is "
                + area);
    }

    public static void calculateTriangleArea() {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get the base
        System.out.print("Enter length of the triangle's base? ");

        BigDecimal base = keyboard.nextBigDecimal();

        // Get the height
        System.out.print("Enter triangle's height? ");

        BigDecimal height = keyboard.nextBigDecimal();

        BigDecimal area = base.multiply(height).multiply(new BigDecimal(0.5));

        // Display the triangle's area.
        System.out.println("The triangle's area is "
                + area);
    }
}
