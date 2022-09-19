package io.codelex.arithmetic.practice;
public class Number3 {
    public static void main(String[] args) {
        SumAverageRunningInt();
    }
    public static void SumAverageRunningInt() {
        int start = 2;
        int end = 7;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        float avg = (sum/(end-start));
        System.out.println("The sum of " +start+ " to " +end+ " is " +sum);
        System.out.println("The average is "+avg);
    }
}
