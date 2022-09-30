package io.codelex.classesandobjects.practice;

public class FuelGauge {
    static int fuelLvl = 0;
    public static int getFuelLvl(){
        return fuelLvl;
    }
    public static void pump(){
        if (fuelLvl <= 70) {
            fuelLvl++;
        }
    }
    public static void consume(){
        if (fuelLvl > 0) {
            fuelLvl--;
        }
    }
}
