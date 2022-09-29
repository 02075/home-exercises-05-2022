package io.codelex.classesandobjects.practice;

import java.util.Objects;
import java.util.Scanner;

public class LitersPerKm {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        double startKilometers, endKilometers, liters;

         System.out.print("Enter first reading: " );
         startKilometers = scan.nextDouble();
         System.out.print("Enter second reading: " );
         endKilometers = scan.nextDouble();
         System.out.print("Enter liters consumed: " );
         liters  = scan.nextDouble();
         Car car = new Car(startKilometers,endKilometers,liters);
         System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();
        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();
        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();
        Car car2 = new Car(startKilometers, endKilometers, liters);
        if (car2.ecoCar()) {
            System.out.println("Kilometers per liter are " + car2.calculateConsumption() + " & " + "your car is saving money");
        } else if (car2.gasHog()) {
            System.out.println("Kilometers per liter are " + car2.calculateConsumption() + " & " + "your car is guzzling gas.");
        } else {System.out.println("Kilometers per liter are " + car2.calculateConsumption() + " & " + "nothing special in performance.");}
        double kMPL = car2.calculateConsumption();
        do {
            System.out.println("Your car can go "+kMPL+" Km per liter of fuel. How much fuel do you pump?");
            double input = scan.nextDouble();
            System.out.println("Your car travels " + car2.fillUp(input, kMPL) + " kM before it needs more sauce.");
            System.out.println("Pump more (type: pump) or abandon your vehicle (type: bye)?");
            String eater = scan.nextLine();
            String input1 = scan.nextLine();
            if (Objects.equals(input1, "bye")) {
                System.out.println("farewell compadre...");
                break;
            }
        } while (1 > 0);
    }
}
