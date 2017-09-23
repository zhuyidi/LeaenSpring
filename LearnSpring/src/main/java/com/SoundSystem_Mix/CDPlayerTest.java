package com.SoundSystem_Mix;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by dela on 8/12/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:CDPlayer.xml")
@ContextConfiguration(classes = SoundSystemConfig.class)
public class CDPlayerTest {
    //这是来源于System Rules库的一个JUnit规则, 该规能够基于控制台的输出编写断言.
    //在这里, 我们断言Jay.play()方法的输出被发送到了控制台上.
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        //若程序运行没有出现异常, 说明断言正确
        assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
        assertEquals("正在播放周杰伦的专辑Jay", log.getLog());
    }
}

