package AssemblingBean.Knights;

/**
 * Created by dela on 8/15/17.
 */

//这是一个去拯救公主的骑士
public class KnightOfRescuesPrincess implements Knight {
    private RescuesPrincessQuest quest;

    //拯救公主的骑士只能拯救公主
    public KnightOfRescuesPrincess(){
        this.quest = new RescuesPrincessQuest();
    }

    //调用任务的开始方法, 代表骑士开始解救公主了
    public void embarkOnQuest() {
        quest.embark();
    }
}
