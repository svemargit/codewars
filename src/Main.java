package src;

import src.exercises.Training;

public class Main {
    public static void main(String[] args) {
        /* nothing for main class at the moment */
        System.out.println("This is a Main class, starting up...");
        var training = new Training();
    System.out.println(training.spinWords("Welcome to my world"));
        System.out.println(training.whoLikesIt("Martin", "Michale", "George", "asd", "diva"));
    }
}