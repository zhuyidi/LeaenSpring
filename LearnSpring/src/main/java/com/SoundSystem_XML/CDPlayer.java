package com.SoundSystem_XML;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dela on 8/14/17.
 */

public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

//    @Autowired
//    public CDPlayer(CompactDisc cd){
//        this.cd = cd;
//    }

    @Autowired
    public void setCd(CompactDisc cd){
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
