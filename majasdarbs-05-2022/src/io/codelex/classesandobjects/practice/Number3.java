package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class Number3 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(1>0) {
            System.out.println("The tank is empty! How many liters do you pump? (70l = max capacity.)");
            int input = in.nextInt();
            while (input > 70 || input <= 0) {
                System.out.println("Invalid input! How many liters do you pump??????");
                input = in.nextInt();
            }
            for (int i = 0; i < input; i++) {
                FuelGauge.pump();
            }
            System.out.println("Your car has " + FuelGauge.getFuelLvl() + " liters of fuel.");

            while (FuelGauge.fuelLvl != 0) {
                Odometer.drive();
            }
            System.out.println("Your car travels " + input*10 + " miles.");
            System.out.println("Your car has traveled a total of " + Odometer.getMileage() + " miles.");
        }
    }
}
