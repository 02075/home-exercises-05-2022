package io.codelex.classesandobjects.practice;

import java.util.ArrayList;

public class Movie {
    String title;
    String studio;
    String rating;
    public Movie(String title, String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public static ArrayList<Movie> getPg(Movie[] arr){
        ArrayList<Movie> pGMovie = new ArrayList<Movie>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].rating.equals("PG")) {
                pGMovie.add(arr[i]);
            }
        } return pGMovie;
    }
}
