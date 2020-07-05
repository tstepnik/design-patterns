package com.tstepnik.singleton;

import com.tstepnik.singleton.logic.GameEngine;

public class Main {


    public static void main(String[] args) {

        GameEngine engine = GameEngine.getInstance();
        GameEngine engine2 = GameEngine.getInstance();

        System.out.println(engine==engine2);

    }
}
