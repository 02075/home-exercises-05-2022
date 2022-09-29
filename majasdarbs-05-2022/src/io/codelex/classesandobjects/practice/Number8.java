package io.codelex.classesandobjects.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Number8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("How much money is in the account?:");
        SavingsAccount.balance = in.nextInt();
        System.out.println("Enter the annual interest rate:");
        double input1 = in.nextDouble();
        System.out.println("How long has the account been opened?:");
        double input2 = in.nextDouble();
        for (int i = 1; i <= input2; i++) {
            System.out.println("Enter amount deposited for month" + i + ":");
            SavingsAccount.deposit(in.nextInt());
            System.out.println("Enter amount withdrawn for month" + i + ":");
            SavingsAccount.withdrawal(in.nextInt());
            SavingsAccount.interest(input1);
        }
        DecimalFormat df = new DecimalFormat("###,###.00");
        System.out.println("Total deposited: $" + df.format(SavingsAccount.totalDep));
        System.out.println("Total withdrawn: $" + df.format(SavingsAccount.totalWith));
        System.out.println("Interest earned: $" + df.format(SavingsAccount.totalInt));
        System.out.println("Ending balance: $" + df.format(SavingsAccount.balance));
    }
}
