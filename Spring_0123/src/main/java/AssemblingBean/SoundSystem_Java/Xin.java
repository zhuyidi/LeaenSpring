package AssemblingBean.SoundSystem_Java;

/**
 * Created by dela on 9/4/17.
 */
public class Xin implements CompactDisc {
    private String title = "专辑死了都要爱";
    private String artist = "信";

    public void play() {
        System.out.print("正在播放" + artist + "的" + title);
    }
}
