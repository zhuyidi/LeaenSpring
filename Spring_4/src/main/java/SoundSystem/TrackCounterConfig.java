package SoundSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by dela on 10/19/17.
 */

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDisc mayDay(){
        List<String> tracks = new ArrayList<String>();

        MayDayDisc cd = new MayDayDisc();
        cd.setArtist("五月天");
        cd.setTitle("后青春期的诗");
        tracks.add("突然好想你");
        tracks.add("你不是真正的快乐");
        tracks.add("笑忘歌");
        tracks.add("如烟");
        tracks.add("我心中尚未崩坏的地方");
        tracks.add("生存以上生活以下");
        cd.setTracks(tracks);

        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}