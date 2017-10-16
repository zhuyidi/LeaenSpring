package AssemblingBean.SoundSystem_XML;

/**
 * Created by dela on 9/19/17.
 */
public class JayZhou implements CompactDisc {

    private String title;
    private String artist;

    public JayZhou(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}