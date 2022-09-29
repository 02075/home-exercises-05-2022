package io.codelex.classesandobjects.practice;

public class Number1 {

    public static void main(String[] args){
        Product obj1 = new Product("Logitech mouse", 70, 14);
        Product obj2 = new Product("Epson EB-U05", 440.46, 1);
        Product obj3 = new Product("iPhone 5s", 999.99, 3);

        obj1.printProduct();

        obj1.setAmmount(420);
        obj1.printProduct();
        obj2.setPrice(22.22);
        obj2.printProduct();
    }
}
