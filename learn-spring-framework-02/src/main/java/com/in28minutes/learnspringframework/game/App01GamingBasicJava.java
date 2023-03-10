package com.in28minutes.learnspringframework.game;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacManGame;

public class App01GamingBasicJava {

    public static void main(String[] args){
        var game = new PacManGame();
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
