package io.codelex.classesandobjects.practice.videostore;

public class Video {
    String title;
    int rating;

    String status = "Available ";

    public Video(String name, int rating){
        this.title = name;
        this.rating = rating;
    }
}
