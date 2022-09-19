package io.codelex.typesandvariables.practice;
import java.text.DecimalFormat;
public class Casting {
    private static final DecimalFormat df = new DecimalFormat("0.0");
    public static void main(String[] args) {
        first();
        second();
    }
    private static void first() {
        int a = 1;
        int b = 2;
        int c = 3;
        double d = 4;
        float e = 5;
        //fixme - should be 15 :|
        double sum = a + b + c + d + e;
        System.out.println(sum);
    }
    private static void second() {
        int a = Integer.parseInt("1");
        Integer b = 2;
        int c = 3;
        double d = 4.2;
        float e = 5.3f;
        //fixme - should be 15.5 :| 
        double sum = (a + b + c + d + e);
        System.out.println(df.format(sum));
    }
}
