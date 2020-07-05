package com.tstepnik.singleton.logic;

public class GameEngine {

    public int hp = 100;
    private String characterName = "";

    private static GameEngine instance;

    private GameEngine() {

    }

    public void run() {
        while (true) {

        }
    }

    public static GameEngine getInstance() {
        if (instance==null) {
            instance = new GameEngine();
        }
        return instance;
    }
}
