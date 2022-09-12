package io.codelex.typesandvariables.practice;



public class number7 {

    public static void main(String[] args) {

        numOfCaps("aJjjnbnbjFFFnJBgGDGBbjnjN");

    }

    public static void numOfCaps(String args) {
        char[] ch = args.toCharArray();
        int sum = 0;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                sum += 1;
            }
        }
        System.out.println("There are "+sum+" capital letters in this string.");

    }

}
