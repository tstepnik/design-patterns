package com.tstepnik.my_singleton;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public enum GuessGame {
    INSTANCE();

    private int score = 0;
    private Scanner scanner = new Scanner(System.in);

     GuessGame() {
    }

    ;


    public void play() {
        int chances = 10;

        while (chances > 0) {
            int random = new Random().nextInt(11);
            System.out.println("wybierz liczbę od 0-10");
           int choose = 0;
            try{
                choose = scanner.nextInt();
                if (choose>10){
                    throw new IllegalArgumentException("Twoja liczba nie mieści się w przedziale 0-10.");
                }


            if (random == choose) {
                System.out.println("Brawo zgadłeś, zdobyłeś 1 punkt!");
                score++;
            } else {
                System.out.println("Niestety nie trafiłeś, wylosowana liczba to " + random);
            }
            chances--;
            System.out.println("Pozostało " + chances + " szans.");
            }catch (InputMismatchException e) {
                System.err.println("Nie możesz podawać innych znaków niż liczby z przedziału 0-10 !");
                scanner.next();
            }catch (IllegalArgumentException e){
                System.err.println(e.getMessage());
            }
        }
        System.out.println("Koniec gry, Twój wynik to: " + score);
    }

    public int getScore() {
        return score;
    }
}
