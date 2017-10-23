package SoundSystem;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by dela on 10/19/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TrackCounterConfig.class)
public class TrackCounterTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter(){
        cd.playTrack(0);
        cd.playTrack(0);
        cd.playTrack(0);
        cd.playTrack(0);
        cd.playTrack(4);
        cd.playTrack(4);
        cd.playTrack(4);
        cd.playTrack(5);
        cd.playTrack(5);

        assertEquals(4, counter.getPlayCount(0));
        assertEquals(3, counter.getPlayCount(4));
        assertEquals(2, counter.getPlayCount(5));
    }
}