package io.codelex.classesandobjects.practice.videostore;

import java.util.Objects;
import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = Integer.parseInt(keyboard.nextLine());

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                default:
                    break;
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.nextLine();
            System.out.println("Enter rating");
            int rating = Integer.parseInt(scanner.nextLine());
            VideoStore.inventory[i] = new Video(movieName, rating);
        }
        VideoStore.printInv();
    }

    private static void rentVideo(Scanner scanner) {
        String input;
        System.out.println("What movie do you rent?");
        input = scanner.nextLine();
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
             if (Objects.equals(input, VideoStore.inventory[i].title) && VideoStore.inventory[i].status){
                 System.out.println("You rented a movie.");
                 VideoStore.inventory[i].rentMov();
                 VideoStore.printInv();
                 break;
             } else if (Objects.equals(input, VideoStore.inventory[i].title) && !VideoStore.inventory[i].status) {
                 System.out.println("This movie is not available.");
                 break;
             }
        }
    }

    private static void returnVideo(Scanner scanner) {
        String input;
        System.out.println("What movie do you want to return?");
        input = scanner.nextLine();
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            if (Objects.equals(input, VideoStore.inventory[i].title) && !VideoStore.inventory[i].status){
                System.out.println("What do you rate this film?");
                VideoStore.inventory[i].returnMov(Integer.parseInt(scanner.nextLine()));
                VideoStore.printInv();
                break;
            }
        }
    }
}
