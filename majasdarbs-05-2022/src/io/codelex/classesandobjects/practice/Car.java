package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class Car {
    double startKilometers;
    double endKilometers;
    double liters;
    double litersInTank;
    public Car(double start, double end, double liter){
      this.startKilometers = start;
      this.endKilometers = end;
      this.liters = liter;
    }
    public double calculateConsumption(){
        return (endKilometers - startKilometers)/liters;
    }
    public boolean ecoCar(){
        return calculateConsumption() > 15;
    }
    public boolean gasHog(){
        return calculateConsumption() < 5;
    }
    public double fillUp(double liters, double concump){
        this.litersInTank = liters;
        return liters*concump;
    }
}
