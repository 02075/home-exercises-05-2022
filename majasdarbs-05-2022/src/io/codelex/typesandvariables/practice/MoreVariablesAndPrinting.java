package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;
public class MoreVariablesAndPrinting {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {


        String name = "Zed A. Shaw";
        int Age = 35;
        double Height = 74 * 2.54;  // inches
        double Weight = 180 * 0.453592; // lbs
        String Eyes = "Blue";
        String Teeth = "White";
        String Hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + Height + " centimeters tall.");
        System.out.println("He's " + df.format(Weight) + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");

        System.out.println("If I add " + Age + ", " + Height + ", and " + df.format(Weight)
                + " I get " + df.format(Age + Height + Weight) + ".");


    }
}