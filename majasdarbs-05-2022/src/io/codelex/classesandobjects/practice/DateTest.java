package io.codelex.classesandobjects.practice;

public class DateTest {
    public static void main(String[] args){
        Date myObj = new Date(13, 9, 1995);
        System.out.println(myObj.displayDate());
        myObj.setDay(22);
        System.out.println(myObj.getDay());
        myObj.setMonth(11);
        System.out.println(myObj.getMonth());
        myObj.setYear(1990);
        System.out.println(myObj.getYear());
        System.out.println(myObj.displayDate());
    }
}
