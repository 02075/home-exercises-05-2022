package io.codelex.classesandobjects.practice;

public class Odometer {
    static int mileage = 0;
    static int cycle = 0;
    public static int getMileage(){
        return mileage;
    }
    public static void drive(){
        if (mileage < 100000) {
            mileage++;
            cycle++;
        } else {
            mileage = 0;
        }
        if (cycle == 10) {
            FuelGauge.consume();
            cycle = 0;
        }
    }
}
