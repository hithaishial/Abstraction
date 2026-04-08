package com.thinkworks.abstraction.internal;

import com.thinkworks.abstraction.external.Game;

public class Chess extends Game {
    @Override
    public void startGame() {
        System.out.println("Chess game starts.");
    }

    @Override
    public void play() {
        System.out.println("Playing chess.");
    }

    @Override
    public void endGame() {
        System.out.println("Chess game ends.");
    }
}
