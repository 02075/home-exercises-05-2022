package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double seatsInACar, carpoolCapacity, averagePassengersPerCar;

        cars = 100; //cars
        seatsInACar = 4.0; //seats in a car
        drivers = 30; // drivers
        passengers = 90; // passengers
        cars_not_driven = cars - drivers; // free cars
        cars_driven = drivers; // cars driven at the moment
        carpoolCapacity = cars_driven * seatsInACar; // carpool capacity
        averagePassengersPerCar = passengers / cars_driven; // average passengers per car

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
    }
}