package io.codelex.classesandobjects.practice.videostore;

public class VideoStore {
    static Video[] inventory = new Video[3];



    public static void printInv(){
        System.out.println("Movie store contains:");
        System.out.println("Movie: " + inventory[0].title+ ", rating: " + inventory[0].rating + ", status: " + inventory[0].status);
        System.out.println("Movie: " + inventory[1].title+ ", rating: " + inventory[1].rating + ", status: " + inventory[0].status);
        System.out.println("Movie: " + inventory[2].title+ ", rating: " + inventory[2].rating + ", status: " + inventory[0].status + "\n");
    }

}
