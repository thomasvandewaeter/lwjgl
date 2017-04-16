package main.game;

import main.engine.GameEngine;
import main.engine.IGameLogic;

public class Main {

    public static void main(String[] args) {
        try {
            IGameLogic game = new DummyGame();
            GameEngine engine = new GameEngine("World of Theumiz", game);
            engine.start();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
