package AssemblingBean.SoundSystem_XML;

import java.util.List;

/**
 * Created by dela on 9/19/17.
 */
public class Discography {
    private String artist;
    private List<CompactDisc> cds;

    public Discography(String artist, List<CompactDisc> cds){
        this.artist = artist;
        this.cds = cds;
    }
}
