package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public final void deposit(double amount) {
        balance += amount;
    }
    public final void withdraw(double amount) {
        balance -= amount;
    }
    public void print(){
        if(balance < 0){
            System.out.println(name + ", -$" +balance*-1);
        } else {
            System.out.println(name + ", $" + balance);
        }
    }
    public static void main(String[] args){
        BankAccount obama = new BankAccount("Hussein Obaman", 6.66);
        obama.deposit(69);
        obama.print();
        BankAccount myDad = new BankAccount("Wsup fam", 0);
        myDad.withdraw(99999);
        myDad.print();
    }
}
