package com.SoundSystem_Java;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dela on 8/14/17.
 */

//@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
