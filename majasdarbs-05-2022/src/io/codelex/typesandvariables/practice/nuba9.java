package io.codelex.typesandvariables.practice;



public class nuba9 {



    public static void main(String[] args) {

        calc(2500, 5, 56, 23);

    }

    public static void calc(int distanceM, int hr, int min, int sec) {

        float fullTimeS = hr*3600 + min*60 + sec;
        float fullTimeH = hr + min/60f + sec/3600f;


        float mPerS = distanceM/fullTimeS;
        float kmPerH = (distanceM/1000f)/fullTimeH;
        float mPerH = (distanceM * 0.000621371192f)/fullTimeH;

        System.out.println(mPerH + " mph  " + kmPerH + " km/h  " + mPerS + " m/h ");

    }

}
