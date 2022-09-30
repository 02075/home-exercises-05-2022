package io.codelex.classesandobjects.practice.videostore;

public class Video {
    String title;
    int combinedRating;
    int rentCount = 1;
    Boolean status = true;

    public Video(String name, int rating){
        this.title = name;
        this.combinedRating = rating;
    }
    public void rentMov(){
        this.status = false;
        this.rentCount++;
    }
    public void returnMov(int rating){
        this.status = true;
        this.combinedRating += rating;
    }
    public int getAvgRating(){
            return this.combinedRating / this.rentCount;

    }
}
