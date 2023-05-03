package com.example.demo;

public class GameRunner {

    MarioGame game;


    public GameRunner(MarioGame game)
    {
        this.game = game;
    }

    public void run()
    {
        System.out.println("Running Game : "+ game);
        game.up();
        game.left();
        game.down();
    }
}
