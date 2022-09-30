package io.codelex.classesandobjects.practice;

public class Product {
    private String name;
    private double price;
    private int ammount;
    public Product(String name, double price, int ammount){
        this.name = name;
        this.price = price;
        this.ammount = ammount;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setAmmount(int ammount){
        this.ammount = ammount;
    }
    public void printProduct(){
        System.out.println(name +", $"+ price +", "+ammount+ " units");
    }
}
