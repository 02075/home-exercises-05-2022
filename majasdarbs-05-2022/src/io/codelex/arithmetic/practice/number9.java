package io.codelex.arithmetic.practice;

public class number9 {

    public static void main(String[] args) {

        fatAss(150, 80);

    }

    public static void fatAss(float weight , float height){

        float BMI = (weight * 703) / (height * height);

        if (BMI < 18.5) {

            System.out.println("Your body is weak, your power is limited. BMI: " + BMI);

        } else if (BMI > 25) {

            System.out.println("You are too fat. Try smoking cigarettes. BMI: " + BMI);

        } else { System.out.println("Your body weight is in the optimal range. BMI: " + BMI);}

    }

}
