package io.codelex.arithmetic.practice;



public class number8 {

    public static void main(String[] args) {


        mone("Tava Mamma", 10, 55);

    }

    public static void mone(String name, float basepay, int hours){

        if (hours > 60) {

            throw new ArithmeticException(name + "You are slaving 2 much. Go home, bruh.");

        } else if (hours > 40) {

            double totalPay = ((40* basepay) + ((hours - 40)*(basepay*1.5)));

            if (totalPay/hours <  8) {

                throw new ArithmeticException(name + ", you are getting scammed. Maby its time for a change.");

            } else {System.out.println("Your total pay is $"+ totalPay);}

        } else {double totalPay = (basepay* hours);

            if (totalPay/hours <  8) {

            throw new ArithmeticException(name + "You are getting scammed. Maby its time for a change.");

        } else {System.out.println("Your total pay is $"+ totalPay);}}

    }

}
