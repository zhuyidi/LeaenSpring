package AssemblingBean.Knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dela on 8/15/17.
 */

@Configuration
public class KnightConfig {
    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Knight knigths(){
        return new BraveKnight(quest());
    }
}
