package com.tstepnik.my_singleton;

public class Main {
    public static void main(String[] args) {
        GuessGame game = GuessGame.INSTANCE;

        game.play();

        int score = game.getScore();

        GuessGame anotherGameReference = GuessGame.INSTANCE;

        System.out.println();
        System.out.println("///////////////////////////////");
        System.out.println("///////////////////////////////");
        System.out.println();

        if (game==anotherGameReference){
            System.out.println("Singleton!");
        }
        if (score == anotherGameReference.getScore()) {
            System.out.println("I punkty się zgadzają!");
        }

    }
}
