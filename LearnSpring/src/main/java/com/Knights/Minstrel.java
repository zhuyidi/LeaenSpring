package com.Knights;

import java.io.PrintStream;

/**
 * Created by dela on 8/16/17.
 */

//这是一个吟游诗人类, 来吟唱骑士的事迹, 两个方法分别在骑士执行任务前后吟唱
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("快来看啊!多么勇敢的骑士要去执行任务啦!");
    }

    public void singAfterQuest(){
        stream.println("快来看啊!勇敢的骑士执行任务回来啦!");
    }
}
