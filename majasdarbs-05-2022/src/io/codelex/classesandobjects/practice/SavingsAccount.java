package io.codelex.classesandobjects.practice;

public class SavingsAccount {
    static double balance;
    static double totalDep;
    static double totalWith;
    static double totalInt;

    public static void withdrawal(double ammount){
       if(balance >= ammount) {
           balance -= ammount;
           totalWith += ammount;
       } else {
           System.out.println("Insufficient funds");
       }
    }
    public static void deposit(double ammount){
        balance += ammount;
        totalDep += ammount;
    }

    public static void interest(double anualRate){
        balance += (anualRate/12)*balance;
        totalInt += (anualRate/12)*balance;
    }
}
