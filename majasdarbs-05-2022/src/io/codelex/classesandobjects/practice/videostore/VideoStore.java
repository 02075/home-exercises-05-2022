package io.codelex.classesandobjects.practice.videostore;

public class VideoStore {
    static Video[] inventory = new Video[3];



    public static void printInv(){
        System.out.println("Movie store contains:");
        System.out.println("Movie: " + inventory[0].title+ ", average user rating: " + inventory[0].getAvgRating() + ", available: " + inventory[0].status);
        System.out.println("Movie: " + inventory[1].title+ ", average user rating: " + inventory[1].getAvgRating() + ", available: " + inventory[1].status);
        System.out.println("Movie: " + inventory[2].title+ ", average user rating: " + inventory[2].getAvgRating() + ", available: " + inventory[2].status + "\n");
    }

}
