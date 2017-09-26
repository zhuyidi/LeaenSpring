package AssemblingBean.Knights;

/**
 * Created by dela on 8/15/17.
 */
public class BraveKnight implements Knight {
    private Quest quest;
//    private Minstrel minstrel;

    //Quest接口被注入进来
    public BraveKnight(Quest quest){
        this.quest = quest;
//        this.minstrel = minstrel;
    }

    public void embarkOnQuest() {
//        minstrel.singBeforeQuest();
        quest.embark();
//        minstrel.singAfterQuest();
    }
}
