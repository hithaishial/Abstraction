package com.thinkworks.abstraction.internal;

import com.thinkworks.abstraction.external.Instrument;

public class Guitar extends Instrument {

    @Override
    public void play() {
        System.out.println("Guitar is playing chords.");
    }

    @Override
    public void tune() {
        System.out.println("Guitar is being tuned.");
    }

    @Override
    public void stop() {
        System.out.println("Guitar stops playing.");
    }

}
