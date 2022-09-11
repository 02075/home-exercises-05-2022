package io.codelex.arithmetic.practice;

import java.util.stream.IntStream;

public class numbersix {

    public static void main(String[] args) {
        CozaLozaWoza();
    }

    public static void CozaLozaWoza() {

        String sad = new String();

        int count = 0;

        for (int i = 1; i < 110; i++) {





            if (i % 3 == 0 | i % 5 == 0 | i % 7 == 0) {

                if (i % 3 == 0){sad += "Coza";}
                if (i % 5 == 0){sad += "Loza";}
                if (i % 7 == 0){sad += "Woza";}
                sad += " ";
                count++;
            } else {sad += String.valueOf(i) + " "; count++;}



            if (count == 11) {
                System.out.println(sad);
                count = 0;
                sad = "";
            }

        }

    }
}