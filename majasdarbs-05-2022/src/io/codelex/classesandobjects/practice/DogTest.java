package io.codelex.classesandobjects.practice;

public class DogTest {
    public static void main(String[] args){
        Dog dg1 = new Dog("Max", "Male");
        Dog dg2 = new Dog("Rocky", "Male");
        Dog dg3 = new Dog("Sparky", "Male");
        Dog dg4 = new Dog("Busta", "Male");
        Dog dg5 = new Dog("Sam", "Male");
        Dog dg6 = new Dog("Lady", "female");
        Dog dg7 = new Dog("Molly", "female");
        Dog dg8 = new Dog("Coco", "female");

        dg1.setMotherNFather(dg6,dg2);
        dg8.setMotherNFather(dg7,dg4);
        dg2.setMotherNFather(dg7,dg5);
        dg4.setMotherNFather(dg6,dg3);

        System.out.println(dg1.parentsName());
        System.out.println(dg3.parentsName());
        System.out.println(dg4.parentsName());
        System.out.println(dg7.parentsName());

        System.out.println(dg8.sameMother(dg2));
        System.out.println(dg3.sameMother(dg1));
        System.out.println(dg3.tooString());

    }
}
