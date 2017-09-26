package AssemblingBean.Knights;

import java.io.PrintStream;

/**
 * Created by dela on 8/15/17.
 */
public class SlayDragonQuest implements Quest {
    //这里并没有直接指定输出的格式, 输出格式由用户在构造方法中决定
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    public void embark() {
        stream.println("骑士开始斩杀恶龙了!!");
    }
}
