package io.codelex.typesandvariables.practice;
import java.text.DecimalFormat;
public class Number8 {
    private static final DecimalFormat df = new DecimalFormat("0.00000");
    public static void main(String[] args) {
        calc(60);
    }
    public static void calc(int mins) {
        double days = mins/1440f;
        double yrs = days/365d;
        System.out.println(mins +" minutes:\r\n" + df.format(days) +" days\r\n" + df.format(yrs) + " years" );
    }
}
