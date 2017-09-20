package com.SoundSystem_XML;

import java.util.List;

/**
 * Created by dela on 9/19/17.
 */
public class MayDayDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;
//    private Set<String> tracks;
//    一般来说, List和Set的区别不是很大, 但是当Spring要装配的是集合的时候, 使用Set集合可以保证集合中的元素不会重复.

    public MayDayDisc(String title, String artist, List<String> tracks){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public void setTracks(List<String> tracks){
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for(String track : tracks){
            System.out.println("-Track: " + track);
        }
    }
}
