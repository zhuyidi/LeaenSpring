package AssemblingBean.Knights;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by dela on 8/15/17.
 */

//这是关于BraveKnight的mock测试, 注入一个mock Quest判断上述依赖注入有没有成功
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest(){
        //创建mock Quest
        Quest mockQuest = mock(Quest.class);
        //注入mock Quest
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();

        //times(1): 在上述条件下, 验证embark()是否只被调用了一次
        verify(mockQuest,times(1)).embark();
    }
}
