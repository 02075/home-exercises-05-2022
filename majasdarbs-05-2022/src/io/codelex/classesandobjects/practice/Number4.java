package io.codelex.classesandobjects.practice;

import java.util.Arrays;

public class Number4 {
    public static void main(String[] args){
        Movie mov1 = new Movie("Casino Royale", "NASA Productions", "PG13");
        Movie mov2 = new Movie("Ayy lmao", "Elon Musty Productions", "PG");
        Movie mov3 = new Movie("Eazy E", "Eon Productions", "PG");
        Movie mov4 = new Movie("Casino pleb", "NASA Productions", "PG");
        Movie mov5 = new Movie("Ayy lmao", "Elon Musty Productions", "PG13");
        Movie mov6 = new Movie("Eazy E", "Eon Productions", "PG13");
        Movie[] movies = {mov1, mov2, mov3, mov4, mov5, mov6};
        for (int i = 0; i < Movie.getPg(movies).size(); i++) {
            System.out.println(Movie.getPg(movies).get(i).title);
        }
        System.out.println("Number of pg movies is " + Movie.getPg(movies).size());
    }
}
