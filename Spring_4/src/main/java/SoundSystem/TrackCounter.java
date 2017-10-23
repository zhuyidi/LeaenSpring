package SoundSystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dela on 10/19/17.
 */

@Aspect
public class TrackCounter {
    private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

    @Pointcut("execution(* SoundSystem.CompactDisc.playTrack(int)) && args(trackNumber))")
    public void trackPlayed(int trackNumber){ }

//    在播放前, 先为该磁道计数
//    只需要保证在通知注解中的切点方法的参数和通知方法的参数名称一直就可以了, 而不必要和切点表达式中的参数名保持一致
    @Before("trackPlayed(number)")
    public void countTrack(int number){
        int currentCount = getPlayCount(number);
        trackCounts.put(number, currentCount+1);
    }

    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }
}