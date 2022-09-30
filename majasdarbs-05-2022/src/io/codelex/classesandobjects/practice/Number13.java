package io.codelex.classesandobjects.practice;

public class Number13 {
    public static void main(String[] args){
        firstAccount();
        moneyTransfer();
        Account A = new Account("A", 100);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);
        transfer(A, B, 50);
        transfer(B, C, 25);
        System.out.println(A.toString()+ "\n" + B.toString() + "\n" + C.toString());
    }
    public static void firstAccount(){
        Account newAccount = new Account("John Doe", 100);
        newAccount.deposit(20);
        System.out.println(newAccount.toString());
    }

    public static void moneyTransfer(){
        Account mattsAcc = new Account("Matt", 1000);
        Account myAcc = new Account("Me", 0);
        System.out.println(mattsAcc + "\n" + myAcc.toString());
        mattsAcc.withdrawal(100);
        myAcc.deposit(100);
        System.out.println(mattsAcc + "\n" + myAcc.toString());
    }
    public static void transfer(Account from,Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
